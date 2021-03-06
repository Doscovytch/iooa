package week2.opdracht3_Pizza;

public class Bolognese extends Pizza{

    public Bolognese() {
        super.setNaam("Bolognese");
        super.setToppings(new String[]{"Bolognese", "souce"});
        super.setPrijs(10.50);
    }

    public Bolognese(String adress) {
        super.setNaam("Bolognese");
        super.setToppings(new String[]{"Bolognese", "souce"});
        super.setPrijs(10.50);
        super.setBezorgadres(adress);
    }

    public void ourmom() {
        System.out.println("Im sad");
    }
}
