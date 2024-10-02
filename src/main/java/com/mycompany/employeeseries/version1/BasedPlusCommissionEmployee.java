/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author clare
 */
public class BasedPlusCommissionEmployee {
    private double totalSales;
    private double baseSalary;
    private String empName;
    private int empID;
 
    public BasedPlusCommissionEmployee() {
    }
    
    public BasedPlusCommissionEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
        
    public BasedPlusCommissionEmployee(double totalSales, double baseSalary, String empName, int empID) {
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
        this.empName = empName;
        this.empID = empID;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public double getTotalSales() {
        return totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }

    public double computeSalary(){
        double salary;
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
        salary = this.baseSalary + (this.totalSales + bonus);
        return salary;
    }
    
    public void displayBasedPlusCommissionEmployee() {
        System.out.println("Employee ID: " + this.getEmpID() + "\nEmployee Name: " + this.getEmpName() + "\nSalary: " + this.computeSalary());
    }
        
    @Override
    public String toString() {
        return "BasedPlusCommissionEmployee{" + "totalSales=" + totalSales + ", baseSalary=" + baseSalary + ", empName=" + empName + ", empID=" + empID + '}';
    }
}
