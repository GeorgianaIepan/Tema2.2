package com.uni;

import java.util.ArrayList;
import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    //Getters
    public String getVorName() {
        return vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    //Setters
    public void setVorname() {
        this.vorName = vorName;
    }

    public void setNachname() {
        this.nachName = nachName;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    //kalkuliereZeit Methode
    public double kalkuliereZeit() {
        double sum = 0;
        for (Sport sp : sport) {
            sum = sum + sp.kalkuliereZeit();
        }
        return sum;
    }

    public double kalkuliereZeit(Sport sp) {
        int k = 0;
        for (int i = 0; i < this.sport.size(); i++) {
            if (this.sport.get(i) == sp)
                k++;
            else if (this.sport.get(i) instanceof Mannschaftssport && sp instanceof Fussball && !(sp instanceof Basketball) && !(this.sport.get(i) instanceof Basketball))
                k++;
            else if (this.sport.get(i) instanceof Mannschaftssport && sp instanceof Basketball && !(sp instanceof Fussball) && !(this.sport.get(i) instanceof Fussball))
                k++;
            else if (this.sport.get(i) instanceof Leichtathletik && sp instanceof Hindernislauf && !(sp instanceof Hochsprung) && !(this.sport.get(i) instanceof Hochsprung))
                k++;
            else if (this.sport.get(i) instanceof Leichtathletik && sp instanceof Hochsprung && !(sp instanceof Hindernislauf) && !(this.sport.get(i) instanceof Hindernislauf))
                k++;
        }
        if (k == 0)
            k = 1;
        return k * sp.kalkuliereZeit();

    }

    public double kalkuliereDurschnittszeit() {
        return kalkuliereZeit() / sport.size();
    }


}
