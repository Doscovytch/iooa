package week2.opdracht2_Personen;

public class Student extends Persoon{
    private Opleiding opleiding = new Opleiding("stom", "niet in de buurt");

    public Student(String naam, int leeftijd, double lengte, double gewicht) {
        super(naam, leeftijd, lengte, gewicht);
    }

    public Opleiding getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(Opleiding opleiding) {
        this.opleiding = opleiding;
    }

    public void werkt() {
        System.out.println("ur mom");
    }
}
