package com.company.paveldejimas.bazine;

public class ZmogusImpl implements Zmogus {
    private String lytis;
    private long asmensKodas;
    private String vardas;
    private String pavarde;
    private int amzius;
    private int ugis;
    private String plaukuSpalva;
    private double svoris;

    public ZmogusImpl(String lytis, long asmensKodas, String vardas, String pavarde, int amzius, int ugis, String plaukuSpalva, double svoris) {
        this.lytis = lytis;
        this.asmensKodas = asmensKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.ugis = ugis;
        this.plaukuSpalva = plaukuSpalva;
        this.svoris = svoris;
    }

    public ZmogusImpl(String lytis, long asmensKodas, String vardas, String pavarde, int amzius, int ugis, String plaukuSpalva) {
        this.lytis = lytis;
        this.asmensKodas = asmensKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.ugis = ugis;
        this.plaukuSpalva = plaukuSpalva;
        this.svoris = svoris;
    }

    public String getLytis() {
        return lytis;
    }

    public long getAsmensKodas() {
        return asmensKodas;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public int getAmzius() {
        return amzius;
    }

    public int getUgis() {
        return ugis;
    }

    public String getPlaukuSpalva() {
        return plaukuSpalva;
    }

    public double getSvoris() {
        return svoris;
    }

    public void setAsmensKodas(long asmensKodas){
        this.asmensKodas = asmensKodas;
    }

    public void setVardas(String vardas){
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde){
        this.pavarde = pavarde;
    }

    public void setAmzius(int amzius){
        this.amzius = amzius;
    }

    public void setUgis(int ugis){
        this.ugis = ugis;
    }

    public void setPlaukuSpalva(String plaukuSpalva){
        this.plaukuSpalva = plaukuSpalva;
    }

    public void setSvoris(double svoris) {
        this.svoris = svoris;
    }

    @Override
    public String toString() {
        return vardas+" "+pavarde+" "+amzius+" "+asmensKodas+" "+svoris+" "+plaukuSpalva+"\n";
    }
}
