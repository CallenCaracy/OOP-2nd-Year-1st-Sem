/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version7;

/**
 *
 * @author clare
 */
public abstract class Employee implements ComputeSalary{
    private int empID;
    private Name empName;
    private Date dateHired;
    private Date dateBirth;

    public Employee(){
        
    }
    
    public Employee(int empID, Name empName, Date dateHired, Date dateBirth) {
        this.empID = empID;
        this.empName = new Name(empName.getFname(), empName.getMname(), empName.getLname());
        this.dateHired = new Date(dateHired.getDay(), dateHired.getMonth(), dateHired.getYear());
        this.dateBirth = new Date(dateBirth.getDay(), dateBirth.getMonth(), dateBirth.getYear());
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(Name empName) {
        this.empName = new Name(empName.getFname(), empName.getMname(), empName.getLname());
    }
    
    public Name getEmpName(){
        return this.empName;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    
    public abstract void displayEmployee();

    @Override
    public String toString() {
        return "Employee ID = " + empID + 
                ",\nName = {" + empName.toString() + '}' + 
                ",\ndateHired = {" + dateHired.toString() + '}' + 
                ",\ndateBirth = {" + dateBirth.toString() + '}';
    }
    
}
