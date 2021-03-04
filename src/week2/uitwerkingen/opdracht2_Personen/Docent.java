package week2.uitwerkingen.opdracht2_Personen;


import java.util.ArrayList;
public class Docent implements Persoon{
    private ArrayList<Student> studenten;
    private Opleiding opleiding;
    public Docent(String naam, int leeftijd, int lengte, int gewicht) {
    }
    public Opleiding getOpleiding() {
        return opleiding;
    }
    public void setOpleiding(Opleiding opleiding) {
        this.opleiding = opleiding;
    }
    public ArrayList<Student> getStudenten() {
        return studenten;
    }
    public void setStudenten(ArrayList<Student> studenten) {
        this.studenten = studenten;
    }
    @Override
    public void werkt() {
        System.out.println("Docent werkt");
    }
}

