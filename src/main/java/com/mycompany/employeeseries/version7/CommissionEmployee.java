/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version7;

/**
 *
 * @author clare
 */
public class CommissionEmployee extends Employee implements ComputeSalary {
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
    
    /**
    * Computes the total salary for the employee, including a bonus based on total sales.
    * The total salary is calculated as the sum of the base sales amount and the bonus.
    * The bonus is calculated using the `calculateBonus()` method.
    *
    * @return the total salary, which is the total sales plus the calculated bonus
    */
    @Override
    public double computeSalary() {
        double bonus = calculateBonus();
        return totalSales + bonus;
    }

    /**
    * Calculates the bonus based on the total sales.
    * The bonus percentage varies depending on the total sales:
    * - 5% for sales less than $10,000
    * - 10% for sales between $10,000 and $100,000
    * - 20% for sales between $100,000 and $1,000,000
    * - 30% for sales above $1,000,000
    *
    * @return the calculated bonus based on the sales thresholds
    */
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
    
    /**
     * Displays the details of the employee.
     */
    @Override
    public void displayEmployee() {
       System.out.println(super.toString() +
                          ",\nTotal Sales = " + this.totalSales +
                          ",\nSalary = " + this.computeSalary());
    }

    /**
     *
     * @return the string version about the employee
     */
    @Override
    public String toString() {
        return "Commission Employee {\n" + super.toString() +
                          ", \nTotal Sales = " + this.totalSales;
    }
}
