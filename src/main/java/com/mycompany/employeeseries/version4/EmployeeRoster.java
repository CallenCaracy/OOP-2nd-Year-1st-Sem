/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version4;

import com.mycompany.employeeseries.version3.*;

/**
 *
 * @author clare
 */
public class EmployeeRoster {
    private int max;
    private int count;
    private Employee[] empList = new Employee[max];

    public EmployeeRoster() {
    }
    
    public EmployeeRoster(int max){
        this.max = max;
        this.empList = new Employee[max];
    }
    
    public boolean addEmployee(Employee e){
        if(this.count < max){
            this.empList[count++] = e;
            return true;
        }
        return false;
    }
    
    public Employee removeEmployee(int ID){
        if(count > 0){
            for(int i = 0; i < count; i++){
                if(this.empList[i].getEmpID() == ID){
                    Employee removed = this.empList[i];
                    for(int j = i; j < count - 1; j++){
                        this.empList[j] = this.empList[j + 1];
                    }
                    this.empList[count - 1] = null;
                    this.count--;
                    return removed;
                }
            }
        }
        return null;
    }
    
    public int countHE(){
        int countHE = 0;
        for(int i = 0; i < count; i++){
            if(this.empList[i] instanceof HourlyEmployee){
                countHE++;
            }
        }
        return countHE;
    }
    
    public int countCE(){
        int countCE = 0;
        for(int i = 0; i < count; i++){
            if(this.empList[i] instanceof CommissionEmployee){
                countCE++;
            }
        }
        return countCE;
    }
    
    public int countBPCE(){
        int countBPCE = 0;
        for(int i = 0; i < count; i++){
            if(this.empList[i] instanceof BasedPlusCommissionEmployee){
                countBPCE++;
            }
        }
        return countBPCE;
    }
    
    public int countPWE(){
        int countPWE = 0;
        for(int i = 0; i < count; i++){
            if(this.empList[i] instanceof PieceWorkerEmployee){
                countPWE++;
            }
        }
        return countPWE;
    }
    
    public void displayHE(){
        if(this.count > 0){
            for(int i = 0; i < count; i++){
                if(this.empList[i] instanceof HourlyEmployee){
                    ((HourlyEmployee)this.empList[i]).displayHourlyEmployee();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayCE(){
        if(this.count > 0){
            for(int i = 0; i < count; i++){
                if(this.empList[i] instanceof CommissionEmployee){
                    ((CommissionEmployee)this.empList[i]).displayCommissionEmployee();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayBPCE(){
        if(this.count > 0){
            for(int i = 0; i < count; i++){
                if(this.empList[i] instanceof BasedPlusCommissionEmployee){
                    ((BasedPlusCommissionEmployee)this.empList[i]).displayBasedPlusCommissionEmployee();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayPWE(){
        if(this.count > 0){
            for(int i = 0; i < count; i++){
                if(this.empList[i] instanceof PieceWorkerEmployee){
                    ((PieceWorkerEmployee)this.empList[i]).displayPieceWorkerEmployee();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayAllEmployeeV2(){
        if(this.count > 0){
            System.out.printf("|   ID   |         NAME         |      DATE BIRTH      |   SALARY   |      TYPE OF EMPLOYEE       |\n");
            for(int i = 0; i < this.count; i++){
                System.out.printf("|   %-4d | %-20s | %-20s | %-27s |\n",
                this.empList[i].getEmpID(),
                this.empList[i].getEmpName(),
                this.empList[i].getDateBirth(),
                this.empList[i].getClass().getSimpleName());
            }
        }
    }
    
    public void displayAllEmployee(){
        if(this.count > 0){
            System.out.printf("|   ID   |         NAME         |      DATE BIRTH      |   SALARY   |      TYPE OF EMPLOYEE       |\n");
            for(int i = 0; i < this.count; i++){
                if(this.empList[i] instanceof HourlyEmployee){
                    System.out.printf("|   %-4d | %-20s | %-20s | %-10.2f | %-27s |\n",
                    this.empList[i].getEmpID(),
                    this.empList[i].getEmpName(),
                    this.empList[i].getDateBirth(),
                    ((HourlyEmployee)this.empList[i]).computeSalary(),
                    this.empList[i].getClass().getSimpleName());
                }else if(this.empList[i] instanceof CommissionEmployee){
                    System.out.printf("|   %-4d | %-20s | %-20s | %-10.2f | %-27s |\n",
                    this.empList[i].getEmpID(),
                    this.empList[i].getEmpName(),
                    this.empList[i].getDateBirth(),
                    ((CommissionEmployee)this.empList[i]).computeSalary(),
                    this.empList[i].getClass().getSimpleName());
                }else if(this.empList[i] instanceof BasedPlusCommissionEmployee){
                    System.out.printf("|   %-4d | %-20s | %-20s | %-10.2f | %-27s |\n",
                    this.empList[i].getEmpID(),
                    this.empList[i].getEmpName(),
                    this.empList[i].getDateBirth(),
                    ((BasedPlusCommissionEmployee)this.empList[i]).computeSalary(),
                    this.empList[i].getClass().getSimpleName());
                }else if(this.empList[i] instanceof PieceWorkerEmployee){
                    System.out.printf("|   %-4d | %-20s | %-20s | %-10.2f | %-27s |\n",
                    this.empList[i].getEmpID(),
                    this.empList[i].getEmpName(),
                    this.empList[i].getDateBirth(),
                    ((PieceWorkerEmployee)this.empList[i]).computeSalary(),
                    this.empList[i].getClass().getSimpleName());
                }
            }
        }
    }
}
