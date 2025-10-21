package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private Double timeIn; // To track when they clocked in

    // Constructor

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.timeIn = null;
    }

    // Existing Getters

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // Derived getters

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return hoursWorked > 40 ? hoursWorked - 40 : 0;
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }

    // exercise 2


    public void punchIn(double time) {
        if (timeIn != null) {
            System.out.println(name + " has already punched in.");
        } else {
            timeIn = time;
            System.out.println(name + " punched in at " + time + ".");
        }
    }

    public void punchOut(double time) {
        if (timeIn == null) {
            System.out.println(name + " must punch in before punching out.");
        } else {
            double hours = time - timeIn;
            if (hours < 0) {
                System.out.println("Invalid time: punch out cannot be before punch in.");
            } else {
                hoursWorked += hours;
                System.out.println(name + " punched out at " + time + " (worked " + hours + " hours).");
            }
            timeIn = null; // reset for next shift
        }
    }
}