package com.company;

import java.util.Comparator;

public class Automobilis implements IAutomobilis, Comparable {
    private String marke;
    private int duruSk;
    private long rida;
    private int metai;

    public Automobilis(String marke, int duruSk, long rida, int metai) {
        this.marke = marke;
        this.duruSk = duruSk;
        this.rida = rida;
        this.metai = metai;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getDuruSk() {
        return duruSk;
    }

    public void setDuruSk(int duruSk) {
        this.duruSk = duruSk;
    }

    public long getRida() {
        return rida;
    }

    public void setRida(long rida) {
        this.rida = rida;
    }

    public int getMetai() {
        return metai;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }

    @Override
    public String toString() {
        return "Automobilis{" +
                "marke='" + marke + '\'' +
                ", duruSk=" + duruSk +
                ", rida=" + rida +
                ", metai=" + metai +
                '}' + "\n";
    }

    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(Automobilis::getMarke)
                .thenComparing(Automobilis::getMetai)
                .thenComparing(Automobilis::getDuruSk)
                .compare(this, (Automobilis) o);
    }
}

