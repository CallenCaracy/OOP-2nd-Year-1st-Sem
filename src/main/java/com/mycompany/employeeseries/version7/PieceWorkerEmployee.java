/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version7;

/**
 *
 * @author clare
 */
public class PieceWorkerEmployee extends Employee implements ComputeSalary {
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
    
    /**
     * Computes the salary for the piece-rate employee based on the number of pieces finished.
     * The salary is calculated by multiplying the total number of pieces finished by the rate per piece.
     * Additionally, the rate per piece is increased by 10% for every 100 pieces finished.
     *
     * @return the computed salary, which is the total number of pieces finished multiplied 
     *         by the updated rate per piece
     */
    @Override
    public final double computeSalary() {
        int hold = this.totalPiecesFinished;

        this.ratePerPiece += (hold / 100) * 10;
        return this.totalPiecesFinished * this.ratePerPiece;
    }
    
    /**
     * Displays the details of the employee.
     */
    @Override
    public final void displayEmployee() {
       System.out.println(super.toString() +
                          ",\nRate Per Piece = " + this.ratePerPiece + 
                          ",\nTotal Pieces Finished = " + this.totalPiecesFinished + 
                          ",\nSalary = " + this.computeSalary());
    }

    /**
     *
     * @return the string version about the employee
     */
    @Override
    public String toString() {
        return "PieceWorkerEmployee Employee {\n" + super.toString() +
                          ", \nRate Per Piece = " + this.ratePerPiece + 
                          ", \nTotal Pieces Finished = " + this.totalPiecesFinished + "\n";
    }
}
