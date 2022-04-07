package com.company;

import java.util.List;

public class Movie {

    private String genre;
    private List<Actor> actors;
    private double budget;
    private double moneySpent;
    private double  moneyEarned;
    private static double profit;
    private Director director;
    private List<Crew> crewMembers;

    public String getGenre() {
        return genre;
    }
    public double getBudget() {
        return budget;
    }
    public double getMoneySpent() {
        return moneySpent;
    }
    public static double getProfit() {
        return profit;
    }
    public List<Actor> getActors() {
        return actors;
    }
    public List<Crew> getCrewMembers() {
        return crewMembers;
    }
    public Director getDirector() {
        return director;
    }

    public Movie(String genre, Director director, List<Actor> actors, List<Crew> crewMembers, double budget){
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.crewMembers = crewMembers;
        this.budget = budget;
        this.moneySpent = 0;
        this.moneyEarned = 0;
        this.profit = 0;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned += moneyEarned;
        calculateProfit(moneyEarned);
    }

    public void calculateProfit(double moneyEarned) {
        profit = (budget - moneySpent) + moneyEarned;
        System.out.println("This movie made this profit. " + profit );
    }

    public void payDay() {
        for (int i = 0; i < actors.size(); i++) {
            Actor a = actors.get(i);
            moneySpent += a.getSalary();
            a.updateMoneyEarned();
        }
        for (int i = 0; i < crewMembers.size(); i++) {
            Crew c = crewMembers.get(i);
            moneySpent += c.getSalary();
            c.updateMoneyEarned();
        }
        moneySpent += director.getSalary();
            director.updateMoneyEarned();
            System.out.println("This movie spent $ " + this.moneySpent + "out of $ " + this.budget);

    }


}
