package week2.opdracht1_Figuren;

import java.util.ArrayList;

public class FigurenApp {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Driehoek());
        list.add(new Vierkant());
        list.add(new Vierhoek());

        for(Object f : list) {
            System.out.println(f);
        }
    }

}
