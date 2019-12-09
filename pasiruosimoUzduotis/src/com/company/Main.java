package com.company;

import com.company.bazine.Fabrikas;
import com.company.bazine.Gamyba;
import com.company.bazine.IGamyba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Fabrikas fabrikas = new Fabrikas();
        ArrayList <Gamyba> suvestine = fabrikas.generuotiSuvestine();


        System.out.println("*******************************************");
        System.out.println("Bendra pagamintų detalių dienos suvestinė:");
        System.out.println("*******************************************");
        fabrikas.spausdintiBendraSuvestine(suvestine);

        System.out.println("*******************************************");
        System.out.println("Surikiuota suvestinė:");
        System.out.println("*******************************************");
        Collections.sort(suvestine);
        fabrikas.spausdintiBendraSuvestine(suvestine);

        System.out.println("*******************************************");
        System.out.println("Suvestinė su normomis:");
        System.out.println("*******************************************");

        for (Gamyba suvesta : suvestine) {
            if (suvesta.getKiekis() >= 1000) {
                System.out.println("Detalė: " + suvesta.getDetale() + ", kiekis: " +
                        suvesta.getKiekis() + ", už sumą: " + suvesta.getSuma() + " NORMA ĮVYKDYTA");
            } else System.out.println("Detalė: " + suvesta.getDetale() + ", kiekis: " +
                    suvesta.getKiekis() + ", už sumą: " + suvesta.getSuma() + " NORMA NEĮVYKDYTA");
        }

        System.out.println("*******************************************");
        System.out.println("Suvestinė su pašalintais įrašais:");
        System.out.println("*******************************************");

        fabrikas.pasalintiSuDidesneKaina(suvestine, 100);
        fabrikas.spausdintiBendraSuvestine(suvestine);
    }
}
