package bazine;

import java.util.Collection;
import java.util.Comparator;

public class Balsuotojas implements IBalsuotojas, Comparable {
    String vardas;
    String pavarde;
    int metai;
    String apygarda;
    String tautybe;

    public Balsuotojas(String vardas, String pavarde, int metai, String apygarda, String tautybe) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.metai = metai;
        this.apygarda = apygarda;
        this.tautybe = tautybe;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getMetai() {
        return metai;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }

    public String getApygarda() {
        return apygarda;
    }

    public void setApygarda(String apygarda) {
        this.apygarda = apygarda;
    }

    public String getTautybe() {
        return tautybe;
    }

    public void setTautybe(String tautybe) {
        this.tautybe = tautybe;
    }
     @Override
    public int compareTo(Object o) {
        return Comparator.comparing(Balsuotojas::getMetai).compare(this, (Balsuotojas) o);
    }
}
