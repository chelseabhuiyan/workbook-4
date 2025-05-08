package com.pluralsight;

import java.time.LocalDateTime;


public class Employee {
    private String name;
    private String employeeId;
    private String department;
    private double payRate;
    private double hoursWorked;
    private Double startTime= null;

    public Employee(String name, String employeeId, String department, double payRate, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.department =  department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
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

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    //Time is double in military format
    public void punchIn(double time) {
        if (startTime == null) { //if null then they will punch in now
            startTime = time;
            System.out.println(name + " punched in at " + time);
        } else {
            System.out.println("Already punched in!");
        }
    }

    public void punchOut(double time) {
        if (startTime != null) {
            double worked = time - startTime;
            hoursWorked += worked;
            startTime = null; // reset for next shift
            System.out.println(name + " punched out at " + time + ". Worked: " + worked + " hours");
        } else {
            System.out.println("Punch in first!"); //if user wasn't punched in
        }
    }
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + now.getMinute() / 60.0;
        punchIn(currentTime);
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + now.getMinute() / 60.0;
        punchOut(currentTime);
    }
}
