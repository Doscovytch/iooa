package week2.uitwerkingen.opdracht1_Figuren;

import java.util.ArrayList;
import java.util.List;

public class FigurenApp {
    public static void main(String[] args) {
        ArrayList<Figuur> figuurList = new ArrayList<Figuur>();
        figuurList.add(new Driehoek());
        figuurList.add(new Vierkant());
        figuurList.add(new Vierhoek());
        figuurList.forEach(f -> {
            System.out.println(f.toString());
        });
        //        for (Figuur figuur : figuurList) {
        //            System.out.println(figuur.toString());
        //        }
    }
}

