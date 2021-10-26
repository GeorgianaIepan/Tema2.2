package com.uni;

public class Leichtathletik implements Sport {
    @Override
    public double kalkuliereZeit() {
        Hochsprung hoch = new Hochsprung();
        Hindernislauf hind = new Hindernislauf();

        return hoch.kalkuliereZeit() + hind.kalkuliereZeit();
    }
}
