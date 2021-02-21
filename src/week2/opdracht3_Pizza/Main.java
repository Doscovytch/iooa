package week2.opdracht3_Pizza;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> allPizzas = new ArrayList<>();

        allPizzas.add(new Tonno());
        allPizzas.add(new Bolognese());
        allPizzas.add(new Quattro_Stagionni());
        allPizzas.add(new Calzone());

        for (Object pizza : allPizzas) {

            if (pizza instanceof Tonno) {

                Tonno p = (Tonno) pizza;
                System.out.println(p.getNaam() + " " + p.getClass());
                p.yourmom();

            } else {

                Pizza p = (Pizza) pizza;
                System.out.println(p.getNaam() + " " + p.getClass());
            }
        }

        // they lied to me. you can make an object of en abstract class
        Pizza gsri = new Pizza(){};
        System.out.println(gsri.getClass());
    }
}
