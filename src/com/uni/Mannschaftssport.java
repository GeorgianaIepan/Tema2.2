package com.uni;

public class Mannschaftssport implements Sport {
    @Override
    public double kalkuliereZeit() {
        Basketball bask = new Basketball();
        Fussball fuss = new Fussball();

        return bask.kalkuliereZeit() + fuss.kalkuliereZeit();
    }
}
