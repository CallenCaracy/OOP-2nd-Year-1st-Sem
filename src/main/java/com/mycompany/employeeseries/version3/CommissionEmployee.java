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
    protected double salary;
    
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
       System.out.println("Commission Employee {" + "\nempID = " + super.getEmpID() + 
                          ",\nName = {" + super.getEmpName().getLname() + ' ' + super.getEmpName().getFname() + ", " + super.getEmpName().getMname().charAt(0) + '}' + 
                          ",\ndateHired = {" + super.getDateHired().getYear() + '/' + super.getDateHired().getDay() + '/' + super.getDateHired().getMonth() + '}' + 
                          ",\ndateBirth = {" + super.getDateBirth().getYear() + '/' + super.getDateBirth().getDay() + '/' + super.getDateBirth().getMonth() + '}' + 
                          ",\nTotal Sales = " + this.totalSales +
                          ",\nSalary = " + this.salary);
    }

    @Override
    public String toString() {
        return "Commission Employee {" + "empID = " + super.getEmpID() + 
                          ", Name = {" + super.getEmpName().getLname() + ' ' + super.getEmpName().getFname() + ", " + super.getEmpName().getMname().charAt(0) + '}' + 
                          ", dateHired = {" + super.getDateHired().getYear() + '/' + super.getDateHired().getDay() + '/' + super.getDateHired().getMonth() + '}' + 
                          ", dateBirth = {" + super.getDateBirth().getYear() + '/' + super.getDateBirth().getDay() + '/' + super.getDateBirth().getMonth() + '}' + 
                          ", Total Sales = " + this.totalSales + "\n";
    }
}
