package week2.opdracht2_Personen;

import java.util.ArrayList;

public class Docent extends Persoon{
    private ArrayList<Object> studenten = new ArrayList<>();
    public Docent(String naam, int leeftijd, double lengte, double gewicht) {
        super(naam, leeftijd, lengte, gewicht);

        studenten.add(new Student("Henk", 12, 2.0, 100));
        studenten.add(new Student("Gert", 11, 1.2, 36));
    }

    public void werkt() {
        System.out.println("ur mom");
    }
}
