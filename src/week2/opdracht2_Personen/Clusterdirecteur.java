package week2.opdracht2_Personen;

public class Clusterdirecteur extends Persoon {
    private Onderwijsmanager[] onderwijsmanagers = new Onderwijsmanager[4];
    private Secretaresse[] secetaresses = new Secretaresse[2];

    public Clusterdirecteur(String naam, int leeftijd, double lengte, double gewicht) {
        super(naam, leeftijd, lengte, gewicht);
    }

    public Onderwijsmanager[] getOnderwijsmanagers() {
        return onderwijsmanagers;
    }

    public void setOnderwijsmanagers(Onderwijsmanager[] onderwijsmanagers) {
        this.onderwijsmanagers = onderwijsmanagers;
    }

    public Secretaresse[] getSecetaresses() {
        return secetaresses;
    }

    public void setSecetaresses(Secretaresse[] secetaresses) {
        this.secetaresses = secetaresses;
    }

    public void werkt() {
        System.out.println("ur mom");
    }
}
