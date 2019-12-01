package com.company.paveldejimas.isvestine;

import com.company.paveldejimas.bazine.ZmogusImpl;
import com.company.paveldejimas.bazine.Zmogus;
import com.company.paveldejimas.bazine.ZmogusImpl;

import java.util.ArrayList;


public class StatybininkasImpl extends ZmogusImpl implements Statybininkas, Comparable<StatybininkasImpl>{
    private int stazas;
    private String issilavinimas;
    private String specializacija;
    private double atlyginimas;

    public StatybininkasImpl(String lytis, long asmensKodas, String vardas, String pavarde, int amzius, int ugis, String plaukuSpalva, double svoris,
                             int stazas, String issilavinimas, String specializacija, double atlyginimas) {
        super(lytis,asmensKodas,vardas,pavarde,amzius,ugis,plaukuSpalva,svoris);
        this.stazas = stazas;
        this.issilavinimas = issilavinimas;
        this.specializacija = specializacija;
        this.atlyginimas = atlyginimas;
    }

    public double getAtlyginimas() {
        return atlyginimas;
    }

    public void setAtlyginimas(double atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    public int getStazas() {
        return stazas;
    }

    public void setStazas(int stazas) {
        this.stazas = stazas;
    }

    public String getIssilavinimas() {
        return issilavinimas;
    }

    public void setIssilavinimas(String issilavinimas) {
        this.issilavinimas = issilavinimas;
    }

    public String getSpecializacija() {
        return specializacija;
    }

    public void setSpecializacija(String specializacija) {
        this.specializacija = specializacija;
    }

    @Override
    public String toString() {
        return getVardas()+ " " + getPavarde()+ " " + getAsmensKodas()+ " " + getAmzius()+ " " + getLytis()+ " " +
                getSvoris()+ " " + getUgis() + " " + issilavinimas + " " + stazas + " " + specializacija + " " +
                atlyginimas;
    }

    @Override
    public int compareTo(StatybininkasImpl statybininkas) {
        return Double.compare(getAtlyginimas(), statybininkas.getAtlyginimas());
    }
}
