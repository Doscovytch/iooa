package week2.uitwerkingen.opdracht2_Personen;

import java.util.ArrayList;
public class Onderwijsmanager implements Persoon{
    private ArrayList<Docent> docenten;
    private Secretaresse secretaresse;
    private Opleiding opleiding;
    public Onderwijsmanager(String naam, int leeftijd, int lengte, int gewicht) {
    }
    @Override
    public void werkt() {
        System.out.println("Onderwijsmanager werkt");
    }
}
