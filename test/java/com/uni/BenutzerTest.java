package com.uni;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    @Test
    void kalkuliereZeit() {

        Benutzer ben = new Benutzer("Alex", "Popescu", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        assertEquals(170, ben.kalkuliereZeit());

        Mannschaftssport man = new Mannschaftssport();
        assertEquals(man.kalkuliereZeit(), 120);

        Fussball fuss = new Fussball();
        assertEquals(fuss.kalkuliereZeit(), 65);

        Basketball bask = new Basketball();
        assertEquals(bask.kalkuliereZeit(), 55);

        Leichtathletik leicht = new Leichtathletik();
        assertEquals(leicht.kalkuliereZeit(), 50);

        Hindernislauf hind = new Hindernislauf();
        assertEquals(hind.kalkuliereZeit(), 30);

        Hochsprung hoch = new Hochsprung();
        assertEquals(hoch.kalkuliereZeit(), 20);

    }

    @Test
    void kalkuliereDurschnittszeit() {
        Benutzer ben = new Benutzer("Andrei", "Pop", Arrays.asList(new Basketball(), new Fussball(), new Hochsprung(), new Hindernislauf()));
        assertEquals(42.5, ben.kalkuliereDurschnittszeit());
    }

}