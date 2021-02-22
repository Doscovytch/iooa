package week2.opdracht3_Pizza;

public abstract class Pizza {
    private String naam = "Default";
    private String[] toppings = {"souce"};
    private double prijs = 0;
    private String bezorgadres = "Default";

    public Pizza() {}

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getBezorgadres() {
        return bezorgadres;
    }

    public void setBezorgadres(String bezorgadres) {
        this.bezorgadres = bezorgadres;
    }
}
