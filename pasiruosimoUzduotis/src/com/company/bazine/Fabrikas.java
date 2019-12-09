package com.company.bazine;

import java.util.ArrayList;
import java.util.Iterator;

public class Fabrikas {
    public ArrayList <Gamyba> generuotiSuvestine(){
        ArrayList<Gamyba> suvestine = new ArrayList<>();
        suvestine.add(new Gamyba("Jonas", "plokstele", 40, 10));
        suvestine.add(new Gamyba("Paulius", "vinis", 500, 2));
        suvestine.add(new Gamyba("Simas", "plaktukas", 100, 25));
        suvestine.add(new Gamyba("Laimis", "plokste", 1000, 200));
        suvestine.add(new Gamyba("Kazys", "detale", 100000, 5));
        suvestine.add(new Gamyba("Povilas", "detalyte", 999, 320));
        suvestine.add(new Gamyba("Petras", "detale", 1500, 5));
        suvestine.add(new Gamyba("Julius", "plokste", 1500, 100));
        suvestine.add(new Gamyba("Romas", "jungiklis", 100000, 55));
        suvestine.add(new Gamyba("Vilius", "sujungiklis", 67, 30));
        suvestine.add(new Gamyba("Rokas", "plokste", 300, 460));

        return suvestine;
    }
    public void spausdintiBendraSuvestine(ArrayList<Gamyba> suvestine) {
        for (Gamyba suvesta : suvestine) {
            System.out.println("Detalė: " + suvesta.getDetale() + ", kiekis: " + suvesta.getKiekis() + ", už sumą: " +
                    suvesta.getSuma());
        }
    }

    public void pasalintiSuDidesneKaina(ArrayList<Gamyba> suvestine, double kaina){
        Iterator<Gamyba> i = suvestine.iterator();
        while (i.hasNext()) {
            if (i.next().getKaina() > kaina)
                i.remove();
        }
    }
}
