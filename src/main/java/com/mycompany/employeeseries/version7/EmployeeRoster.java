/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeseries.version7;

import java.util.ArrayList;

/**
 *
 * @author clare
 */
public class EmployeeRoster {
    private ArrayList<Employee> empList;
    
    public EmployeeRoster(){
        this.empList = new ArrayList<>();
    }
    
    public void addEmployee(Employee e){
        empList.add(e);
    }
    
    public Employee removeEmployee(int ID){
        if(empList.size() > 0){
            for(int i = 0; i < empList.size(); i++){
                if(this.empList.get(i).getEmpID() == ID){
                    Employee removed = this.empList.get(i);
                    empList.remove(i);
                    return removed;
                }
            }
        }
        return null;
    }
    
    public int countHE(){
        int countHE = 0;
        for(int i = 0; i < empList.size(); i++){
            if(this.empList.get(i) instanceof HourlyEmployee){
                countHE++;
            }
        }
        return countHE;
    }
    
    public int countCE(){
        int countCE = 0;
        for(int i = 0; i < empList.size(); i++){
            if(this.empList.get(i) instanceof CommissionEmployee && !(this.empList.get(i) instanceof BasedPlusCommissionEmployee)){
                countCE++;
            }
        }
        return countCE;
    }
    
    public int countBPCE(){
        int countBPCE = 0;
        for(int i = 0; i < empList.size(); i++){
            if(this.empList.get(i) instanceof BasedPlusCommissionEmployee){
                countBPCE++;
            }
        }
        return countBPCE;
    }
    
    public int countPWE(){
        int countPWE = 0;
        for(int i = 0; i < empList.size(); i++){
            if(this.empList.get(i) instanceof PieceWorkerEmployee){
                countPWE++;
            }
        }
        return countPWE;
    }
    
    public void displayHE(){
        if(this.empList.size() > 0){
            for(int i = 0; i < empList.size(); i++){
                if(this.empList.get(i) instanceof HourlyEmployee){
                    ((HourlyEmployee)this.empList.get(i)).displayEmployee();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayCE(){
        if(this.empList.size() > 0){
            for(int i = 0; i < empList.size(); i++){
                if(this.empList.get(i) instanceof CommissionEmployee){
                    ((CommissionEmployee)this.empList.get(i)).displayEmployee();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayBPCE(){
        if(this.empList.size() > 0){
            for(int i = 0; i < empList.size(); i++){
                if(this.empList.get(i) instanceof BasedPlusCommissionEmployee){
                    ((BasedPlusCommissionEmployee)this.empList.get(i)).displayEmployee();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayPWE(){
        if(this.empList.size() > 0){
            for(int i = 0; i < empList.size(); i++){
                if(this.empList.get(i) instanceof PieceWorkerEmployee){
                    ((PieceWorkerEmployee)this.empList.get(i)).displayEmployee();
                }else{
                    continue;
                }
            }
        }
    }
    
    public void displayAllEmployeeV2(){
        if(this.empList.size() > 0){
            System.out.printf("___________________________________________________________________________________________________\n");
            System.out.printf("|   ID   |         NAME         |      DATE BIRTH      |   SALARY   |      TYPE OF EMPLOYEE       |\n");
            for(int i = 0; i < this.empList.size(); i++){
                System.out.printf("|   %-4d | %-20s | %-20s | %-27s |\n",
                this.empList.get(i).getEmpID(),
                this.empList.get(i).getEmpName(),
                this.empList.get(i).getDateBirth(),
                this.empList.get(i).getClass().getSimpleName());
            }
        }
    }
    
    public void displayAllEmployee(){
        if(this.empList.size() > 0){
            System.out.printf("___________________________________________________________________________________________________\n");
            System.out.printf("|   ID   |         NAME         |      DATE BIRTH      |   SALARY   |      TYPE OF EMPLOYEE       |\n");
            for(int i = 0; i < this.empList.size(); i++){
                if(this.empList.get(i) instanceof HourlyEmployee){
                    System.out.printf("|   %-4d | %-20s | %-20s | %-10.2f | %-27s |\n",
                    this.empList.get(i).getEmpID(),
                    this.empList.get(i).getEmpName(),
                    this.empList.get(i).getDateBirth(),
                    ((HourlyEmployee)this.empList.get(i)).computeSalary(),
                    this.empList.get(i).getClass().getSimpleName());
                }else if(this.empList.get(i) instanceof CommissionEmployee){
                    System.out.printf("|   %-4d | %-20s | %-20s | %-10.2f | %-27s |\n",
                    this.empList.get(i).getEmpID(),
                    this.empList.get(i).getEmpName(),
                    this.empList.get(i).getDateBirth(),
                    ((CommissionEmployee)this.empList.get(i)).computeSalary(),
                    this.empList.get(i).getClass().getSimpleName());
                }else if(this.empList.get(i) instanceof BasedPlusCommissionEmployee){
                    System.out.printf("|   %-4d | %-20s | %-20s | %-10.2f | %-27s |\n",
                    this.empList.get(i).getEmpID(),
                    this.empList.get(i).getEmpName(),
                    this.empList.get(i).getDateBirth(),
                    ((BasedPlusCommissionEmployee)this.empList.get(i)).computeSalary(),
                    this.empList.get(i).getClass().getSimpleName());
                }else if(this.empList.get(i) instanceof PieceWorkerEmployee){
                    System.out.printf("|   %-4d | %-20s | %-20s | %-10.2f | %-27s |\n",
                    this.empList.get(i).getEmpID(),
                    this.empList.get(i).getEmpName(),
                    this.empList.get(i).getDateBirth(),
                    ((PieceWorkerEmployee)this.empList.get(i)).computeSalary(),
                    this.empList.get(i).getClass().getSimpleName());
                }
            }
            System.out.printf("___________________________________________________________________________________________________\n");
        }
    }
}
