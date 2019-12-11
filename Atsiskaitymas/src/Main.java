import bazine.Balsuotojas;
import bazine.Rinkimai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Rinkimai rinkimai = new Rinkimai();
        ArrayList <Balsuotojas> sarasas = rinkimai.generuotiSarasas();
        System.out.println("Sąrašas su rinkėjų informacija: ");
        rinkimai.spausdintiSarasa(sarasas);
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.println("Įveskite norimą apygardą (Dainava, Šilainiai, Šančiai, Žaliakalnis) : ");
        String ats = s.nextLine();
        System.out.println("Šioje apygardoje balsuotojų skaičius: " + rinkimai.gautiApygardosBalsuotojus(sarasas, ats));
        System.out.println();
        Collections.sort(sarasas);
        System.out.println("Pagal gimimo metus surikiuotas sąrašas nuo vyriausio iki jauniausio: ");
        rinkimai.spausdintiSarasa(sarasas);
        System.out.println();
        rinkimai.pasalintiTautybe(sarasas,"Lenkas/ė");
        System.out.println("Sąrašas be Lenkų tautybės rinkėjų: ");
        rinkimai.spausdintiSarasa(sarasas);
    }
}
