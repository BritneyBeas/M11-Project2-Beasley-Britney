package com.company;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Person p = new Person("P", 100000);
        Actor a = new Actor("A", 1000000, "lead");
        Crew c = new Crew("C", 300000, "Lighting");
        Director d = new Director("D", 20000000, "Film");

        Actor denzelWashington = new Actor("Denzel Washington", 750000, "Lead");
        Actor reginaHall =  new Actor( "Regina Hall", 750000, "Lead");
        List<Actor> actors = new ArrayList<>();
        actors.add(denzelWashington);
        actors.add(reginaHall);


        Movie movie = new Movie("Horror",d,actors,);
        movie.payDay();



    }
}
