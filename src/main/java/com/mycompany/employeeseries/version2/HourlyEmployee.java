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
    private double salary = 0;

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
        if(this.totalHoursWorked <= 40){
            salary = this.totalHoursWorked * this.ratePerHour;
        }else if(this.totalHoursWorked > 40){
            float overtimeHours = this.totalHoursWorked - 40;
            salary = (40 * this.ratePerHour) + (overtimeHours * this.ratePerHour * 1.5);
        }
        return this.salary;
    }
    
    public void displayHourlyEmployee() {
        System.out.println("Employee ID: " + super.getEmpID() + 
                           "\nEmployee Name: " + super.getEmpName() +
                           "\nTotalHoursWorked: " + totalHoursWorked + 
                           "\nRatePerHour: " + ratePerHour + 
                           "\nSalary: " + salary);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "Employee ID = " + super.getEmpID() + 
                                   ", Employee Name = " + super.getEmpName() + 
                                   ", totalHoursWorked = " + totalHoursWorked + 
                                   ", ratePerHour = " + ratePerHour + '}';
    }
    
    
}
