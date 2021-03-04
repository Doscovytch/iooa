package week2.uitwerkingen.opdracht2_Personen;

import week2.uitwerkingen.opdracht2_Personen.Onderwijsmanager;
import week2.uitwerkingen.opdracht2_Personen.Persoon;
import week2.uitwerkingen.opdracht2_Personen.Secretaresse;

public class Clusterdirecteur implements Persoon {
    private Onderwijsmanager[] onderwijsmanagers = new Onderwijsmanager[4];
    private Secretaresse[] secretaresses = new Secretaresse[2];
    public Clusterdirecteur(String naam, int leeftijd, int lengte, int gewicht) {
    }
    @Override
    public void werkt() {
        System.out.println("Directeur werkt");
    }
    public Secretaresse[] getSecretaresses() {
        return secretaresses;
    }
    public void setSecretaresses(Secretaresse[] secretaresses) {
        this.secretaresses = secretaresses;
    }
    public Onderwijsmanager[] getOnderwijsmanagers() {
        return onderwijsmanagers;
    }
    public void setOnderwijsmanagers(Onderwijsmanager[] onderwijsmanagers) {
        this.onderwijsmanagers = onderwijsmanagers;
    }
}
