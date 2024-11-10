/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version7;

/**
 *
 * @author clare
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee implements ComputeSalary{
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
    
    /**
    * Computes the total salary for the employee, including the base salary and 
    * the salary computed by the parent class.
    * This method overrides the `computeSalary()` method in the parent class.
    * The total salary is the sum of the base salary and the computed salary from 
    * the parent class's `computeSalary()` method.
    *
    * @return the total salary, which is the base salary plus the computed salary from the parent class
    */
    @Override
    public final double computeSalary(){
        return this.basedSalary + super.computeSalary();
    }
    
    /**
     * Displays the details of the employee.
     */
    @Override
    public final void displayEmployee() {
       System.out.println(super.toString() +
                          ",\nbasedSalary = " + this.basedSalary +
                          ",\nSalary = " + this.computeSalary());
    }

    /**
     *
     * @return the string version about the employee
     */
    @Override
    public String toString() {
        return "Based Plus Commission Employee {\n" + super.toString() +
                          ", \nbasedSalary = " + this.basedSalary + "\n";
    }
}
