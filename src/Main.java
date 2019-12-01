import com.company.paveldejimas.bazine.Zmogus;
import com.company.paveldejimas.bazine.ZmogusImpl;
import com.company.paveldejimas.isvestine.Statybininkas;
import com.company.paveldejimas.isvestine.StatybininkasImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        StatybininkasImpl stat1 = new StatybininkasImpl("vyr", 44012250237L, "Petras",
                "Petraitis", 25, 180, "juoda", 80.5, 3,
                "vidurinis", "pagalbinis", 500);
        StatybininkasImpl stat2 = new StatybininkasImpl("mot", 47856230459L, "Laima",
                "Vaikulė", 45, 160, "juoda", 60, 1,
                "vidurinis", "pagalbine", 400);
        StatybininkasImpl stat3 = new StatybininkasImpl("mot", 47612363615L, "Ona",
                "Onaitienė", 33, 175, "geltona", 65.5, 5,
                "vidurinis", "murininkas", 530);
        StatybininkasImpl stat4 = new StatybininkasImpl("mot", 47989452125L, "Vilma",
                "Kazlauskė", 55, 173, "raudona", 73.30, 24,
                "vidurinis", "dazytojas", 624.35);
        StatybininkasImpl stat5 = new StatybininkasImpl("vyr", 44012250237L, "Edvinas",
                "Petraitis", 25, 180, "juoda", 80.5, 3,
                "vidurinis", "pagalbinis", 350);
        StatybininkasImpl stat6 = new StatybininkasImpl("vyr", 44012250237L, "Vilius",
                "Petraitis", 25, 180, "juoda", 80.5, 10,
                "vidurinis", "pagalbinis", 500);
        StatybininkasImpl stat7 = new StatybininkasImpl("vyr", 44012250237L, "Giedrius",
                "Petraitis", 25, 180, "juoda", 80.5, 15,
                "vidurinis", "pagalbinis", 200);
        StatybininkasImpl stat8 = new StatybininkasImpl("vyr", 44012250237L, "Haris",
                "Petraitis", 25, 180, "juoda", 80.5, 2,
                "vidurinis", "pagalbinis", 100);
        StatybininkasImpl stat9 = new StatybininkasImpl("vyr", 44012250237L, "Marius",
                "Petraitis", 25, 180, "juoda", 80.5, 11,
                "vidurinis", "pagalbinis", 900);
        StatybininkasImpl stat10 = new StatybininkasImpl("vyr", 44012250237L, "Rimas",
                "Petraitis", 25, 180, "juoda", 80.5, 9,
                "vidurinis", "pagalbinis", 500);

        ArrayList<StatybininkasImpl> statybininkai = new ArrayList<>();
        statybininkai.add(stat1);
        statybininkai.add(stat2);
        statybininkai.add(stat3);
        statybininkai.add(stat4);
        statybininkai.add(stat5);
        statybininkai.add(stat6);
        statybininkai.add(stat7);
        statybininkai.add(stat8);
        statybininkai.add(stat9);
        statybininkai.add(stat10);


		/*Iterator<StatybininkasImpl> i = statybininkai.iterator();
		while (i.hasNext()){
			StatybininkasImpl statybininkas = i.next();
			System.out.println(statybininkas);
		}*/

		for (StatybininkasImpl statybininkas : statybininkai){
			System.out.println(statybininkas);
		}

        ArrayList<StatybininkasImpl> nereikalingiStat = new ArrayList<>();
        for (StatybininkasImpl statybininkas : statybininkai) {
            if (statybininkas.getStazas() < 4) {
				nereikalingiStat.add(statybininkas);
            }
        }
        for (StatybininkasImpl nereikalingas : nereikalingiStat){
        	statybininkai.remove(nereikalingas);
		}
		System.out.println(statybininkai.size());

        Collections.sort(statybininkai);
		for (StatybininkasImpl statybininkas : statybininkai){
			System.out.println(statybininkas);
		}
		System.out.println("Nuo didziausio iki maziausio:");


		Collections.reverse(statybininkai);
		for (StatybininkasImpl statybininkas : statybininkai){
			System.out.println(statybininkas);
		}






	}
}
