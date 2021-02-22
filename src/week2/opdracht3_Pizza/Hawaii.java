package week2.opdracht3_Pizza;

public class Hawaii extends Pizza{

    public Hawaii() {
        super.setNaam("Hawaii");
        super.setToppings(new String[]{"Hawaii", "souce"});
        super.setPrijs(12.75);
    }

    public Hawaii(String adress) {
        super.setNaam("Hawaii");
        super.setToppings(new String[]{"Hawaii", "souce"});
        super.setPrijs(12.75);
        super.setBezorgadres(adress);
    }
}
