package week1.opdracht3_PersonenArray;

import java.util.ArrayList;

public class PersonenApp {
    public static void main(String[] args) {
        ArrayList<Persoon> personenlijst = new ArrayList<Persoon>();
        int i = 0;
        while (i < 6) {
            personenlijst.add(new Persoon(String.format("%s", i), 18+i));
            i ++;
        }
        vindLettersEnPrint(personenlijst, "3");
    }

    public static void vindLettersEnPrint(ArrayList<Persoon> personen, String letters) {
        for (Persoon persoon: personen) {
            if (persoon.bevatLetters(letters)) {
                System.out.println("Match found: " + persoon.naam);
            }
        }
    }

}
