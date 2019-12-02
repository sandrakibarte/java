package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Automobilis> automobiliai = new ArrayList<>();
        automobiliai.add(new Automobilis("BMW", 4, 356412L, 2000));
        automobiliai.add(new Automobilis("Audi", 2, 451257L, 2012));
        automobiliai.add(new Automobilis("Audi", 4, 526412L, 2019));
        automobiliai.add(new Automobilis("Ford", 4, 6421358L, 1990));
        automobiliai.add(new Automobilis("Audi", 4, 548796L, 2003));
        automobiliai.add(new Automobilis("Mazda", 4, 147856L, 2019));
        automobiliai.add(new Automobilis("BMW", 4, 896547L, 2004));
        automobiliai.add(new Automobilis("Audi", 4, 695478L, 2019));
        automobiliai.add(new Automobilis("Audi", 4, 526412L, 2006));
        automobiliai.add(new Automobilis("Audi", 4, 456123L, 2019));


        System.out.println();
        for (Automobilis auto : automobiliai) {
            System.out.println(auto);
        }

        Iterator<Automobilis> i = automobiliai.iterator();
        while (i.hasNext()) {
            if(i.next().getRida()> 500000){
                i.remove();
            }
        }

        System.out.println();
        for (Automobilis auto : automobiliai) {
            System.out.println(auto);
        }
        System.out.println("Rusiuotas sarasas: ");
        Collections.sort(automobiliai);

        System.out.println(automobiliai);

    }
}
