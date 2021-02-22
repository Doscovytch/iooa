package week2.opdracht3_Pizza;

public class Calzone extends Pizza{

    public Calzone() {
        super.setNaam("Calzone");
        super.setToppings(new String[]{"Calzone", "souce"});
        super.setPrijs(10.50);
    }

    public Calzone(String adress) {
        super.setNaam("Calzone");
        super.setToppings(new String[]{"Calzone", "souce"});
        super.setPrijs(10.50);
        super.setBezorgadres(adress);
    }
}
