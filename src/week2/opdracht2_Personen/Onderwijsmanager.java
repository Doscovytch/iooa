package week2.opdracht2_Personen;

import java.util.ArrayList;

public class Onderwijsmanager extends Persoon{
    private ArrayList<Object> docenten = new ArrayList<>();
    private Secretaresse secretaresse = new Secretaresse("Kees", 43, 12, 350);

    public Onderwijsmanager(String naam, int leeftijd, double lengte, double gewicht) {
        super(naam, leeftijd, lengte, gewicht);

        docenten.add(new Docent("Kees", 11, 1.55, 75));
    }

    public void werkt() {
        System.out.println("ur mom");
    }
}
