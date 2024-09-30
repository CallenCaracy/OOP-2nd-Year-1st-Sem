/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version2;

/**
 *
 * @author clare
 */
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    private double salary = 0;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, int empID, String empName) {
        super(empID, empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName) {
        super(empID, empName);
    }

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, Employee emp) {
        this.setEmpID(emp.getEmpID());
        this.setEmpName(emp.getEmpName());
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary() {
        int hold = this.totalPiecesFinished;

        this.ratePerPiece += (hold / 100) * 10;
        salary = this.totalPiecesFinished * this.ratePerPiece;
        return salary;
    }
    
    public void displayPieceWorkerEmployee() {
        System.out.println("Employee ID: " + super.getEmpID() + 
                           "\nEmployee Name: " + super.getEmpName() + 
                           "\ntotalPiecesFinished = " + totalPiecesFinished + 
                           "\nratePerPiece = " + ratePerPiece +
                           "\nsalary: " + this.salary);
    }

    @Override
    public String toString() {
        return "PieceWorkerEmployee{" + "Employee ID = " + super.getEmpID() + 
                                    ", Employee Name = " + super.getEmpName() + 
                                    ", totalPiecesFinished = " + totalPiecesFinished + 
                                    ", ratePerPiece = " + ratePerPiece + '}';
    }
}
