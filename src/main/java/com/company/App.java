package com.company;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Person p = new Person("P", 10000);
        Actor a = new Actor("A", 10000, "lead");
        Crew c = new Crew("C", 3000, "Lighting");
        Director d = new Director("D", 20000, "Film");
        PA pa = new PA("P", 150, "Film");

        Actor denzelWashington = new Actor("Denzel Washington", 75000, "Lead");
        Actor reginaHall =  new Actor( "Regina Hall", 75000, "Lead");
        List<Actor> actors = new ArrayList<>();
        actors.add(denzelWashington);
        actors.add(reginaHall);

        Crew samuel = new Crew("Samuel", 7500, "Staging");
        Crew chris = new Crew("Chris", 6500, "Lighting");
        Crew britney = new Crew("Britney", 7000, "Hair and Makeup");
        Crew tamara = new Crew("Tamara",9000, "Wardrobe" );
        List<Crew> crewMembers = new ArrayList<>();
        crewMembers.add(samuel);
        crewMembers.add(chris);
        crewMembers.add(britney);
        crewMembers.add(tamara);
        crewMembers.add(pa);

        Movie movie = new Movie("Horror", d, actors, crewMembers,2000000);
        pa.addingHours(8);
        movie.payDay();
        movie.setMoneyEarned(90000000);
        d.calculateRoyalties();
        System.out.println("The director made $ " + d.getRoyalties() + "in royalties.");
        System.out.printf("The director made $ %.2f in royalties.", d.getRoyalties());





    }
}
