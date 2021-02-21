package week1.opdracht1_BestandenLezenEnSchrijven;

public class Main {
    public static void main(String[] args) {
        String file = "C:\\Users\\Koning Max\\IdeaProjects\\iooa\\src\\week1\\opdracht1_BestandenLezenEnSchrijven\\plaatsen.txt";
        LeesSteden.printStedenUitBestand(file);
        SchrijfBestand.schrijfStedenNaarBestand(file);
        LeesSteden.printStedenUitBestand(file);
    }
}
