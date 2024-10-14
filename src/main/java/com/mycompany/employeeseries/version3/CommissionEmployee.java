/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version3;

/**
 *
 * @author clare
 */
public class CommissionEmployee extends Employee {
    protected double totalSales;
    
    public CommissionEmployee() {
        super();
    }
    
    public CommissionEmployee(int empID, Name empName, Date dateHired, Date dateBirth, double totalSales) {
        super(empID, empName, dateHired, dateBirth);
        this.totalSales = totalSales;
    }    
    
    public CommissionEmployee(Employee emp, double totalSales) {
        super(emp.getEmpID(), emp.getEmpName(), emp.getDateHired(), emp.getDateBirth());
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary() {
        double salary;
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
       System.out.println(super.toString() +
                          ",\nTotal Sales = " + this.totalSales +
                          ",\nSalary = " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "Commission Employee {" + super.toString() +
                          ", Total Sales = " + this.totalSales;
    }
}
