/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author clare
 */
public class CommissionEmployee extends Employee{
    protected double totalSales;

    public CommissionEmployee() {
    }
    
    public CommissionEmployee(int empID, String empName){
        super(empID, empName);
    }

    public CommissionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }

    public CommissionEmployee(double totalSales, int empID, String empName) {
        super(empID, empName);
        this.totalSales = totalSales;
    }

    public CommissionEmployee(double totalSales, Employee emp) {
        this.setEmpID(emp.getEmpID());
        this.setEmpName(emp.getEmpName());
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary() {
        double salary = 0;
        double bonus = calculateBonus();
        salary = totalSales + bonus;
        return salary;
    }

    private double calculateBonus() {
        if (totalSales < 10000) {
            return totalSales * 0.05;
        } else if (totalSales < 100000) {
            return totalSales * 0.1;
        } else if (totalSales < 1000000) {
            return totalSales * 0.2;
        } else {
            return totalSales * 0.3;
        }
    }

    public void displayCommissionEmployee() {
        System.out.println("CommissionEmployee: " + super.toString() + 
                           " totalSales: " + this.totalSales + 
                           " salary: " + this.computeSalary());
    }
    
    @Override
    public String toString() {
        return "CommissionEmployee{ " + "Employee: " + super.toString() + 
                                   ", totalSales = " + totalSales + '}';
    }

}
