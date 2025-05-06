package com.pluralsight;

public class Employee {
    private String name;
    private String employeeId;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String name, String employeeId, String department, double payRate, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }
    public double getRegularHours(){
       if (hoursWorked<=40){
           return hoursWorked;
       }else{
           return 40;
       }
    }
    public double getOvertimeHours(){
        if (hoursWorked>40){
            return hoursWorked-40;
        }else{
            return 0;
        }
    }

}
