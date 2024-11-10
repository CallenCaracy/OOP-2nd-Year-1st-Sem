/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version7;

/**
 *
 * @author clare
 */
public class Name {
    private String fname;
    private String mname;
    private String lname;
    
    public Name(){
        
    }
    
    public Name(String fname, String mname, String lname){
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {      
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    
    public void displayName(){
        if(mname != null && !mname.isEmpty()){
            System.out.println(lname + ' ' + fname + ", " + mname.charAt(0) + '.');
        }else{
            System.out.println(lname + ' ' + fname + ", " + '.');
        }
    }

    @Override
    public String toString() {
        if(mname != null && !mname.isEmpty()){
            return lname + ' ' + fname + ", " + mname.charAt(0) + '.';
        }
        return lname + ' ' + fname; 
    }
}
