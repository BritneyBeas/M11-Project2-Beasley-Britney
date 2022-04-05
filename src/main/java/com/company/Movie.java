package com.company;

import java.util.List;

public class Movie {

    public String getGenre() {
        return genre;
    }

    private String genre;
    private List<Actor> actors;
    private int budget;

    public int getBudget() {
        return budget;
    }

    public int getMoneySpent() {
        return moneySpent;
    }

    public int getMoneyEarned() {
        return moneyEarned;
    }

    public int getProfit() {
        profit = moneyEarned - moneySpent;
        return profit;
    }

    private int moneySpent;
    private int moneyEarned;
    private int profit;

    public List<Actor> getActors() {
        return actors;
    }

    public List<Crew> getCrewMembers() {
        return crewMembers;
    }

    private List<Crew> crewMembers;

    public Director getDirector() {
        return director;
    }

    private Director director;

    public Movie(String genre, Director director, List<Actor> actors, List<Crew> crewMembers, int budget, int moneySpent,
                 int moneyEarned, int profit){
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.crewMembers = crewMembers;
        this.budget = budget;
        this.moneySpent = moneySpent;
        this.moneyEarned = moneyEarned;
        this.profit = profit;
    }

    public void payDay() {
        for (int i = 0; i < actors.size(); i++) {
            Actor a = actors.get(i);
            moneySpent += a.getSalary();
            a.setEarned(a.getEarned() + a.getSalary());
        }

        for (int i = 0; i < crewMembers.size(); i++) {
            Crew a = crewMembers.get(i);
            moneySpent += a.getSalary();
            a.setEarned(a.getEarned() + a.getSalary());
        }
    }

}
