/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version6;

/**
 *
 * @author clare
 */
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    
    public PieceWorkerEmployee() {
        super();
    }
    
    public PieceWorkerEmployee(int empID, Name empName, Date dateHired, Date dateBirth, double ratePerPiece, int totalPiecesFinished) {
        super(empID, empName, dateHired, dateBirth);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }    
    
    public PieceWorkerEmployee(Employee emp, double ratePerPiece, int totalPiecesFinished) {
        super(emp.getEmpID(), emp.getEmpName(), emp.getDateHired(), emp.getDateBirth());
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    @Override
    public double computeSalary() {
        int hold = this.totalPiecesFinished;

        this.ratePerPiece += (hold / 100) * 10;
        return this.totalPiecesFinished * this.ratePerPiece;
    }
    
    @Override
    public void displayEmployee() {
       System.out.println(super.toString() +
                          ",\nRate Per Piece = " + this.ratePerPiece + 
                          ",\nTotal Pieces Finished = " + this.totalPiecesFinished + 
                          ",\nSalary = " + this.computeSalary());
    }

    @Override
    public String toString() {
        return "PieceWorkerEmployee Employee {\n" + super.toString() +
                          ", \nRate Per Piece = " + this.ratePerPiece + 
                          ", \nTotal Pieces Finished = " + this.totalPiecesFinished + "\n";
    }
}
