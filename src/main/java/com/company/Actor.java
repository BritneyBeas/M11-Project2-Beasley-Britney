package com.company;

public class Actor extends Person {
    private String role;

    public Actor(String name, int salary, String role) {
        super(name, salary);
        this.role = role;
    }
    public String getRole() {
        return role;
    }






}
