/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;
/**
 *
 * @author clare
 */
public class HourlyEmployee {
    private float totalHoursWorked;
    private double ratePerHour;
    private String empName;
    private int empID;
    private double salary = 0;
    
    public HourlyEmployee() {
    }

    public HourlyEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    
    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
        this.empName = empName;
        this.empID = empID;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
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
        System.out.println("Employee ID: " + this.getEmpID() + "\nEmployee Name: " + this.getEmpName());
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "totalHoursWorked=" + totalHoursWorked + ", ratePerHour=" + ratePerHour + ", empName=" + empName + ", empID=" + empID + '}';
    }
}
