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
        double salary = 0;
        int hold = this.totalPiecesFinished;

        this.ratePerPiece += (hold / 100) * 10;
        salary = this.totalPiecesFinished * this.ratePerPiece;
        return salary;
    }
    
    public void displayPieceWorkerEmployee() {
        System.out.println("PieceWorkerEmployee: " + super.toString() + 
                           " totalPiecesFinished = " + totalPiecesFinished + 
                           " ratePerPiece = " + ratePerPiece +
                           " salary: " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "PieceWorkerEmployee{ " + super.toString() + 
                                    ", totalPiecesFinished = " + totalPiecesFinished + 
                                    ", ratePerPiece = " + ratePerPiece + '}';
    }
}
