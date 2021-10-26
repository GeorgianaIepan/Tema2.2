package com.uni;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Fussball fuss = new Fussball();
        Basketball bask = new Basketball();
        Hindernislauf hind = new Hindernislauf();
        Hochsprung hoch = new Hochsprung();
        Mannschaftssport man = new Mannschaftssport();
        Leichtathletik leicht = new Leichtathletik();

        Benutzer ben = new Benutzer("Vorname", "Name", Arrays.asList(fuss, bask, hind, hoch));

        System.out.println("Benutzer");
        System.out.println(ben.getVorName() + " " + ben.getNachName());


        System.out.println("kalkuliereZeit");
        System.out.println(ben.kalkuliereZeit());


        System.out.println("sport.kalkuliereZeit");
        System.out.println(man.kalkuliereZeit());
        System.out.println(fuss.kalkuliereZeit());
        System.out.println(bask.kalkuliereZeit());

        System.out.println(leicht.kalkuliereZeit());
        System.out.println(hind.kalkuliereZeit());
        System.out.println(hoch.kalkuliereZeit());


        System.out.println("kalkuliereDurschnittzeit");
        System.out.println((ben.kalkuliereDurschnittszeit()));
    }
}
