package week2.opdracht3_Pizza;

public class Quattro_Stagionni extends Pizza{

    public Quattro_Stagionni() {
        super.setNaam("Quattro Stagionni");
        super.setToppings(new String[]{"Quattro Stagionni", "souce"});
        super.setPrijs(10.50);
    }

    public Quattro_Stagionni(String address) {
        super.setNaam("Quattro Stagionni");
        super.setToppings(new String[]{"Quattro Stagionni", "souce"});
        super.setPrijs(10.50);
        super.setBezorgadres(address);
    }
}
