package week1.opdracht1_BestandenLezenEnSchrijven;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeesSteden {
    public static void printStedenUitBestand(String bestandnaam) {
        try{
            File file = new File(bestandnaam);
            Scanner reader = new Scanner(file);
            StringBuilder data = new StringBuilder();
            String line = "";
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                // data.append(line.split(" ")[0]).append("\n");
                data.append(line, 0, line.indexOf(" ")).append("\n");
            }
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
