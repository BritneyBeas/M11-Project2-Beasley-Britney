package com.company;

public class Director extends Crew {
    private double royalties;

    public Director(String personName, double personSalary, String department) {
        super(personName, personSalary, department);
        this.royalties = 0;
    }

    public double getRoyalties() {
        return royalties;
    }

    public void calculateRoyalties() {
        royalties = Movie.getProfit() * .01;
        earned += royalties;
    }
}
