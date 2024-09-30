/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author clare
 */
public class CommissionEmployee {
    private double totalSales;
    private String empName;
    private int empID;
    private double salary = 0;

    public CommissionEmployee() {
    }
    
    public CommissionEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    
    public CommissionEmployee(double totalSales, String empName, int empID) {
        this.totalSales = totalSales;
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public double computeSalary(){
        double bonus = 0;
        if(this.totalSales < 10000){
            bonus = this.totalSales * 0.05;
        }else if(this.totalSales >= 10000 && this.totalSales < 100000){
            bonus = this.totalSales * 0.1;
        }else if(this.totalSales >= 100000 && this.totalSales < 1000000){
            bonus = this.totalSales * 0.2;
        }else if(this.totalSales >= 1000000){
            bonus = this.totalSales * 0.3;
        }
        salary = this.totalSales + bonus;
        return salary;
    }
    
    
    public void displayCommissionEmployee() {
        System.out.println("Employee ID: " + this.getEmpID() + "\nEmployee Name: " + this.getEmpName());
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" + "totalSales=" + totalSales + ", empName=" + empName + ", empID=" + empID + '}';
    }
}
