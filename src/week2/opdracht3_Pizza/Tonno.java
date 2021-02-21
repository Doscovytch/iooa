package week2.opdracht3_Pizza;

public class Tonno extends Pizza{

    public Tonno() {
        super.setNaam("Tonno");
        super.setToppings(new String[]{"tonijn", "souce"});
        super.setPrijs(10.50);
    }

    public void yourmom(){
        System.out.println("urmom");
    }
}
