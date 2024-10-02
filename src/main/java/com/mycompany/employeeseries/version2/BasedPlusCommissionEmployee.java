/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author clare
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasedPlusCommissionEmployee() {
    }

    public BasedPlusCommissionEmployee(int empID, String empName, double totalSales, double baseSalary) {
        super(totalSales, empID, empName);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double baseSalary, CommissionEmployee ce, Employee emp) {
        this.setTotalSales(ce.getTotalSales());
        this.setEmpID(emp.getEmpID());
        this.setEmpName(emp.getEmpName());
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double baseSalary, int empID, String empName, CommissionEmployee ce) {
        super(empID, empName);
        this.setTotalSales(ce.getTotalSales());
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(double totalSales) {
        super(totalSales);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public double computeSalary(){
        double salary;
        salary = this.baseSalary + super.computeSalary();
        return salary;
    }
    
    public void displayBasedPlusCommissionEmployee() {
        System.out.println("BasedPlusCommissionEmployee: " + super.toString() + 
                           " Base Salary:  " + baseSalary +
                           " Salary: " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "BasedPlusCommissionEmployee{ " + super.toString() + 
                                            ", baseSalary = " + baseSalary + '}';
    }
}
