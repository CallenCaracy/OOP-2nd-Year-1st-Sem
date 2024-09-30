 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author clare
 */
public class Employee {
    private int empID;
    private String empName;

    public Employee() {
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID + ", empName=" + empName + '}';
    }
    
    
}
