package bazine;

import java.util.ArrayList;
import java.util.Iterator;

public class Rinkimai {

    public ArrayList<Balsuotojas> generuotiSarasas() {

        ArrayList<Balsuotojas> sarasas = new ArrayList<>();

        sarasas.add(new Balsuotojas("Jonas", "Jonaitis", 1990, "Dainava", "Lietuvis/ė"));
        sarasas.add(new Balsuotojas("Aldona", "Jonaite", 1953, "Šilainiai", "Lietuvis/ė"));
        sarasas.add(new Balsuotojas("Petras", "Jonaitis", 1974, "Šančiai", "Lenkas/ė"));
        sarasas.add(new Balsuotojas("Sandra", "Kibartė", 1986, "Žaliakalnis", "Lietuvis/ė"));
        sarasas.add(new Balsuotojas("Jolanta", "Ralienė", 1972, "Dainava", "Lenkas/ė"));
        sarasas.add(new Balsuotojas("Donatas", "Doaitis", 1945, "Šilainiai", "Lenkas/ė"));
        sarasas.add(new Balsuotojas("Vilius", "Vilaitis", 1979, "Dainava", "Lenkas/ė"));
        sarasas.add(new Balsuotojas("Sigita", "Sigitaitė", 1995, "Šančiai", "Rusas/ė"));
        sarasas.add(new Balsuotojas("Laima", "Laimienė", 1962, "Žaliakalnis", "Lietuvis/ė"));
        sarasas.add(new Balsuotojas("Vilma", "Vilmienė", 1954, "Dainava", "Lietuvis/ė"));

        return sarasas;
    }

    public int gautiApygardosBalsuotojus(ArrayList<Balsuotojas> sarasas, String ats) {
        int rezultatas = 0;
        for (Balsuotojas rinkejas : sarasas) {
            if (rinkejas.getApygarda().equalsIgnoreCase(ats)) {
                rezultatas++;
            }
        }
        return rezultatas;
    }

    public void pasalintiTautybe(ArrayList<Balsuotojas> sarasas, String tautybe) {
        Iterator<Balsuotojas> i = sarasas.iterator();
        while (i.hasNext()) {
            if (i.next().getTautybe().equalsIgnoreCase(tautybe))
                i.remove();
        }
    }

    public void spausdintiSarasa(ArrayList<Balsuotojas> sarasas) {
        for (Balsuotojas rinkejas : sarasas) {
            System.out.println("Vardas: " + rinkejas.getVardas() + ", Pavardė: " + rinkejas.getPavarde() + ", Gimimo metai: "
                    + rinkejas.getMetai() + ", Apygarda: " + rinkejas.getApygarda() + ", Tautybė: " + rinkejas.getTautybe());
        }

    }
}
