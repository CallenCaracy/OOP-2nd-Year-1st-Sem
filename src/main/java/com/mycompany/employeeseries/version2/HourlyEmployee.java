/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author clare
 */
public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private double ratePerHour;


    public HourlyEmployee() {
    }
    
    public HourlyEmployee(int empID, String empName) {
        super(empID, empName);
    }    
    
    public HourlyEmployee(Employee emp) {
        this.setEmpID(emp.getEmpID());
        this.setEmpName(emp.getEmpName());
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour) {
        super(empID, empName);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(Employee emp, float totalHoursWorked, double ratePerHour) {
        this.setEmpID(emp.getEmpID());
        this.setEmpName(emp.getEmpName());
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }
    
    public double getRatePerHour() {
        return ratePerHour;
    }

    public float setTotalHoursWorked (float totalHoursWorked) {
        return this.totalHoursWorked = totalHoursWorked;
    }
    
    public double setRatePerHour (double ratePerHour) {
        return this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary(){
        double salary = 0;
        if(this.totalHoursWorked <= 40){
            salary = this.totalHoursWorked * this.ratePerHour;
        }else if(this.totalHoursWorked > 40){
            float overtimeHours = this.totalHoursWorked - 40;
            salary = (40 * this.ratePerHour) + (overtimeHours * this.ratePerHour * 1.5);
        }
        return salary;
    }
    
    public void displayHourlyEmployee() {
        System.out.println("HourlyEmployee: " + super.toString() + 
                           " TotalHoursWorked: " + totalHoursWorked + 
                           " RatePerHour: " + ratePerHour + 
                           " Salary: " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "HourlyEmployee{ " + super.toString() + 
                               ", totalHoursWorked = " + totalHoursWorked + 
                               ", ratePerHour = " + ratePerHour + '}';
    }
    
    
}
