package com.company;

public class Person {

    private String name;
    private double salary;
    protected double earned;

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public double getEarned() {
        return earned;
    }

    public Person(String name, double salary){
        this.name = name;
        this.salary = salary;
        this.earned = 0;
    }
    public void updateMoneyEarned() {
        this.earned += getSalary();
    }


}
