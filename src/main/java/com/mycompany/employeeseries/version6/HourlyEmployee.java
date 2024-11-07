/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version6;

/**
 *
 * @author clare
 */
public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        super();
    }
    
    public HourlyEmployee(int empID, Name empName, Date dateHired, Date dateBirth, float totalHoursWorked, double ratePerHour) {
        super(empID, empName, dateHired, dateBirth);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }    
    
    public HourlyEmployee(Employee emp, float totalHoursWorked, double ratePerHour) {
        super(emp.getEmpID(), emp.getEmpName(), emp.getDateHired(), emp.getDateBirth());
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }
    
    public double getRatePerHour() {
        return ratePerHour;
    }

    public float setTotalHoursWorked (float totalHoursWorked) {
        return this.totalHoursWorked = totalHoursWorked;
    }
    
    public double setRatePerHour (double ratePerHour) {
        return this.ratePerHour = ratePerHour;
    }
    
    @Override
    public double computeSalary(){
        if(this.totalHoursWorked <= 40){
            return this.totalHoursWorked * this.ratePerHour;
        }else if(this.totalHoursWorked > 40){
            float overtimeHours = this.totalHoursWorked - 40;
            return (40 * this.ratePerHour) + (overtimeHours * this.ratePerHour * 1.5);
        }
        return 0;
    }
    
    @Override
    public void displayEmployee() {
       System.out.println(super.toString() +
                          ",\nRate Per Hour = " + this.ratePerHour + 
                          ",\nTotal Hours Worked = " + this.totalHoursWorked + 
                          ",\nSalary = " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "Hourly Employee {\n" + super.toString() +
                          ", \nRate Per Hour = " + this.ratePerHour + 
                          ", \nTotal Hours Worked = " + this.totalHoursWorked + "\n";
    }
}
