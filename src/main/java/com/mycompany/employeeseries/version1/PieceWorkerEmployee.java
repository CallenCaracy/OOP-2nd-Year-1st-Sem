/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version1;

/**
 *
 * @author clare
 */
public class PieceWorkerEmployee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    private String empName;
    private int empID;

    public PieceWorkerEmployee() {
    }
    
    public PieceWorkerEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    
    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, String empName, int empID) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
        this.empName = empName;
        this.empID = empID;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public double computeSalary() {
        double salary;
        int hold = this.totalPiecesFinished;

        this.ratePerPiece += (hold / 100) * 10;
        salary = this.totalPiecesFinished * this.ratePerPiece;

        return salary;
    }

    public void displayPieceWorkerEmployee() {
        System.out.println("Employee ID: " + this.getEmpID() + "\nEmployee Name: " + this.getEmpName() + "\nSalary: " + this.computeSalary());
    }
        
    @Override
    public String toString() {
        return "PieceWorkerEmployee{" + "totalPiecesFinished=" + totalPiecesFinished + ", ratePerPiece=" + ratePerPiece + ", empName=" + empName + ", empID=" + empID + '}';
    }
}
