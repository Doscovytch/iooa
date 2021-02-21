package week1.opdracht4_WordCount;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WoordenTellerMain {
    public static void main(String[] args) throws FileNotFoundException {
        //create list
        ArrayList<Woord> verbodenWoorden = new ArrayList<>();
        // fill the list with words
        for (String word : new String[]{"the", "of", "that", "to", "and", "are", "in", "is", "a"}) {
            verbodenWoorden.add(new Woord(word));
        }

        // creating more lists idk why
        ArrayList<Woord> woordenVanBestand = new ArrayList<>();
        ArrayList<Woord> woordenGefilterd = new ArrayList<>();
        ArrayList<Woord> woordenGesorteerd = new ArrayList<>();

        try {
            // opening the file and setting up variables
            File file = new File("C:\\Users\\Koning Max\\IdeaProjects\\iooa\\src\\week1\\opdracht1_BestandenLezenEnSchrijven\\opdracht4_WordCount\\IOOA_Word_Count_Bijlage_artikel.txt");
            Scanner reader = new Scanner(file);
            String data = "";
            String[] filter = {"!", ".", ",", ":", "?"};

            // getting all the data from the file
            while (reader.hasNextLine()) {
                data += reader.nextLine()+" ";
            }

            // filtering the data on some characters
            for (String s : filter) {
               data = data.replace(s, "");
            }
            // getting rid of double spaces
            while (data.contains("  ")) {
                data = data.replace("  ", "");
            }

            // setting up some more variables
            int i;
            boolean inlist;
            // converting the data to a list with the Woord class
            for(String s : data.split(" ")) {
                i = 0;
                inlist = false;
                while (i < woordenVanBestand.size()) {
                    if (woordenVanBestand.get(i).word.equals(s)) {
                        Woord tmp_woord = new Woord(s);
                        tmp_woord.teller = woordenVanBestand.get(i).teller+1;
                        woordenVanBestand.set(i, tmp_woord);
                        inlist = true;
                    }
                    i ++;
                } if (!inlist) {
                    woordenVanBestand.add(new Woord(s));
                }
            }

            // sorting the words (Note: this is way cleaner than my first try,
            // a lot of the variables are useless but they where in the exercise so im using them)
            woordenVanBestand.sort(new WoordComparator());

            // generating the end result
            StringBuilder result = new StringBuilder();
            for(Woord w : woordenVanBestand) {
                result.append(String.format("Woord: %s %sx\n", w.word, w.teller));
            }
            // writing the end result to a file
            FileWriter endResult = new FileWriter("result.txt");
            endResult.write(result.toString());
            endResult.close();


        } catch (IOException e) {
            System.out.println("Error time: " + e.toString());
            e.printStackTrace();
        }
    }
}
