package com.company;

public class PA extends Crew {
    private int hoursWorked;

    public PA(String personName, double personSalary, String department) {
        super(personName, personSalary, department);
        this.hoursWorked = 0;
    }

    public void calculatingPay() {
        earned = getSalary() * hoursWorked;
        System.out.println("This PA earned: " + earned);
        this.hoursWorked = 0;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void addingHours(int hoursWorked) {
        this.hoursWorked += hoursWorked;
    }
}
