/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version3;

/**
 *
 * @author clare
 */
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(){
        
    }
    
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay(){
        return day;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setDay(int day){
        this.day = day;
    }
    
    public void setMonth(int month){
        this.month = month;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public void displayName(){
        System.out.println("Date Hired: " + year + '/' + day + '/' + month);
    }

    @Override
    public String toString() {
        return "HireDate{" + "day = " + day + ",\nmonth = " + month + ",\nyear = " + year + '}';
    }
}
