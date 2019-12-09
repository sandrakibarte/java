package com.company.bazine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Gamyba implements IGamyba, Comparable {
    private String darbininkas;
    private String detale;
    private int kiekis;
    private double kaina;

    public Gamyba(String darbininkas, String detale, int kiekis, double kaina) {
        this.darbininkas = darbininkas;
        this.detale = detale;
        this.kiekis = kiekis;
        this.kaina = kaina;
    }

    public String getDarbininkas() {
        return darbininkas;
    }

    public void setDarbininkas(String darbininkas) {
        this.darbininkas = darbininkas;
    }

    public String getDetale() {
        return detale;
    }

    public void setDetale(String detale) {
        this.detale = detale;
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public double getSuma(){
        return kaina * kiekis;
    }

    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(Gamyba::getKiekis, Collections.reverseOrder())
                .thenComparing(Gamyba::getDetale)
                .compare(this, (Gamyba) o);
    }
}

