package com.company;

public class Crew extends Person {
    private String department;

    public Crew(String personName, int personSalary, String department) {
        super(personName, personSalary);
        this.department = department;

    }

    public String getDepartment() {
        return department;
    }
}