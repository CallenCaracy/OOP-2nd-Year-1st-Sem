/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version3;

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
    
    public double computeSalary(){
        salary = this.basedSalary + super.computeSalary();
        return salary;
    }
    
    public void displayBasedPlusCommissionEmployee() {
       System.out.println("Based Plus Commission Employee {" + "\nempID = " + super.getEmpID() + 
                          ",\nName = {" + super.getEmpName().getLname() + ' ' + super.getEmpName().getFname() + ", " + super.getEmpName().getMname().charAt(0) + '}' + 
                          ",\ndateHired = {" + super.getDateHired().getYear() + '/' + super.getDateHired().getDay() + '/' + super.getDateHired().getMonth() + '}' + 
                          ",\ndateBirth = {" + super.getDateBirth().getYear() + '/' + super.getDateBirth().getDay() + '/' + super.getDateBirth().getMonth() + '}' + 
                          ",\nTotal Sales = " + this.totalSales +
                          ",\nbasedSalary = " + this.basedSalary +
                          ",\nSalary = " + this.salary);
    }

    @Override
    public String toString() {
        return "Commission Employee {" + "empID = " + super.getEmpID() + 
                          ", Name = {" + super.getEmpName().getLname() + ' ' + super.getEmpName().getFname() + ", " + super.getEmpName().getMname().charAt(0) + '}' + 
                          ", dateHired = {" + super.getDateHired().getYear() + '/' + super.getDateHired().getDay() + '/' + super.getDateHired().getMonth() + '}' + 
                          ", dateBirth = {" + super.getDateBirth().getYear() + '/' + super.getDateBirth().getDay() + '/' + super.getDateBirth().getMonth() + '}' + 
                          ", Total Sales = " + this.totalSales +
                          ", basedSalary = " + this.basedSalary + "\n";
    }
}
