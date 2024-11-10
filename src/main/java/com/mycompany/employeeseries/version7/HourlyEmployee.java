/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version7;

/**
 *
 * @author clare
 */
public class HourlyEmployee extends Employee implements ComputeSalary {
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

    public void setTotalHoursWorked (float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }
    
    public void setRatePerHour (double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    /**
     * Computes the salary for the hourly employee based on the total hours worked.
     * If the total hours worked are less than or equal to 40, the salary is calculated
     * by multiplying the hours by the hourly rate. If the total hours exceed 40, the 
     * overtime pay is calculated at 1.5 times the regular hourly rate for the hours 
     * worked beyond 40.
     *
     * @return the computed salary, including any overtime pay if applicable
     */
    @Override
    public final double computeSalary(){
        if(this.totalHoursWorked <= 40){
            return this.totalHoursWorked * this.ratePerHour;
        }else if(this.totalHoursWorked > 40){
            float overtimeHours = this.totalHoursWorked - 40;
            return (40 * this.ratePerHour) + (overtimeHours * this.ratePerHour * 1.5);
        }
        return 0;
    }
    
    /**
     * Displays the details of the employee.
     */
    @Override
    public final void displayEmployee() {
       System.out.println(super.toString() +
                          ",\nRate Per Hour = " + this.ratePerHour + 
                          ",\nTotal Hours Worked = " + this.totalHoursWorked + 
                          ",\nSalary = " + this.computeSalary());
    }

    /**
     *
     * @returns a string version about the employee
     */
    @Override
    public String toString() {
        return "Hourly Employee {\n" + super.toString() +
                          ", \nRate Per Hour = " + this.ratePerHour + 
                          ", \nTotal Hours Worked = " + this.totalHoursWorked + "\n";
    }
}
