package week1.opdracht2_BestandsnamenLezen;

import java.io.File;
import java.util.Objects;

public class LeesBestandsNamen {
    public static void printBestandsNamen(String folder) {
        File dir = new File(folder);
        for (String file : Objects.requireNonNull(dir.list())) {
            System.out.println(file);
        }
    }
}
