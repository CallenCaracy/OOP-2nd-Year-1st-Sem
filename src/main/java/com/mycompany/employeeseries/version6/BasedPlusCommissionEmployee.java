/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version6;

/**
 *
 * @author clare
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee{
    private double basedSalary;
    
    public BasedPlusCommissionEmployee(){
        
    }
    
    public BasedPlusCommissionEmployee(int empID, Name empName, Date dateHired, Date dateBirth, double totalSales, double basedSalary) {
        super(empID, empName, dateHired, dateBirth, totalSales);
        this.basedSalary = basedSalary;
    }    
    
    public BasedPlusCommissionEmployee(CommissionEmployee ce, double basedSalary) {
        super(ce.getEmpID(), ce.getEmpName(), ce.getDateHired(), ce.getDateBirth(), ce.getTotalSales());
        this.basedSalary = basedSalary;
    }
    
    public double getbasedSalary(){
        return basedSalary;
    }
    
    public void setBasedSalary(double basedSalary){
        this.basedSalary = basedSalary;
    }
    
    @Override
    public final double computeSalary(){
        return this.basedSalary + super.computeSalary();
    }
    
    @Override
    public final void displayEmployee() {
       System.out.println(super.toString() +
                          ",\nbasedSalary = " + this.basedSalary +
                          ",\nSalary = " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "Based Plus Commission Employee {\n" + super.toString() +
                          ", \nbasedSalary = " + this.basedSalary + "\n";
    }
}
