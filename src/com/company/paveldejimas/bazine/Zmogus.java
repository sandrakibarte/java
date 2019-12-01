package com.company.paveldejimas.bazine;

public interface Zmogus {
    public String getLytis();
    public long getAsmensKodas();
    public String getVardas();
    public String getPavarde();
    public int getAmzius();
    public int getUgis();
    public String getPlaukuSpalva();
    public double getSvoris();
    public void setAsmensKodas(long asmensKodas);
    public void setVardas(String vardas);
    public void setPavarde(String pavarde);
    public void setAmzius(int amzius);
    public void setUgis(int ugis);
    public void setPlaukuSpalva(String plaukuSpalva);
    public void setSvoris(double svoris);
}