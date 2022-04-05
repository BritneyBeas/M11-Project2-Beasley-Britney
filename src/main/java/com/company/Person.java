package com.company;

public class Person {

    private String name;
    private int salary;
    private int earned;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEarned() {
        return earned;
    }

    public void setEarned(int earned) {
        this.earned = earned;
    }

    public Person(String name, int salary){
        this.name = name;
        this.salary = salary;
        this.earned = 0;

    }


}
