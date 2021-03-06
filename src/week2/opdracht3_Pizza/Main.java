package week2.opdracht3_Pizza;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // creating the pizza list
        ArrayList<Pizza> allPizzas = new ArrayList<>();

        // filling the pizza list with pizza
        allPizzas.add(new Tonno());
        allPizzas.add(new Bolognese());
        allPizzas.add(new Quattro_Stagionni());
        allPizzas.add(new Calzone());
        allPizzas.add(new Hawaii());

        // looping through the pizza list and printing the name and price
        for (Pizza pizza : allPizzas) {
            if (pizza instanceof Tonno) {
                Tonno p = (Tonno) pizza;
                System.out.println(p.getNaam() + " " + p.getPrijs() + " " + p.getClass());
                p.yourmom();
            } else {
                // Pizza p = (Pizza) pizza;
                System.out.println(pizza.getNaam() + " " + pizza.getPrijs() + " " + pizza.getClass());
            }
        }

        // they lied to me. you can make an object from en abstract class
        Pizza gsri = new Pizza(){};
        System.out.println(gsri.getClass());
    }
}
