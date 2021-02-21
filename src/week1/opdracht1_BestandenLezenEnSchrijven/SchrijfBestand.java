package week1.opdracht1_BestandenLezenEnSchrijven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SchrijfBestand {
    public static void schrijfStedenNaarBestand(String bestandnaam){

        try{
            String data = "";
            File file = new File(bestandnaam);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                data += reader.nextLine() + "\n";
            }

            data += "Amsterdam 900000\nBunnink 500";
            FileWriter writer = new FileWriter(bestandnaam);
            writer.write(data);
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
