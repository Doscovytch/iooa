package week2.opdracht1_Figuren;

public class Driehoek implements Figuurinterface {
    double lengteZijde1 = 1.0;
    double lengteZijde2 = 1.0;
    double lengteZijde3 = 1.0;
    int[] achtergrondkleur = {255,255,255};
    int[] omtrekkleur = {0,0,0};

    public Driehoek() {
        // leeg
    } // yo

    public Driehoek(double lengteZijde1, double lengteZijde2, double lengteZijde3, int[] achtergrondkleur, int[] omtrekkleur) {
        this.lengteZijde1 = lengteZijde1;
        this.lengteZijde2 = lengteZijde2;
        this.lengteZijde3 = lengteZijde3;
        this.achtergrondkleur = achtergrondkleur;
        this.omtrekkleur = omtrekkleur;
    }

    public double getLengteZijde1() {
        return lengteZijde1;
    }

    public void setLengteZijde1(double lengteZijde1) {
        this.lengteZijde1 = lengteZijde1;
    }

    public double getLengteZijde2() {
        return lengteZijde2;
    }

    public void setLengteZijde2(double lengteZijde2) {
        this.lengteZijde2 = lengteZijde2;
    }

    public double getLengteZijde3() {
        return lengteZijde3;
    }

    public void setLengteZijde3(double lengteZijde3) {
        this.lengteZijde3 = lengteZijde3;
    }

    public int[] getAchtergrondkleur() {
        return achtergrondkleur;
    }

    public void setAchtergrondkleur(int[] achtergrondkleur) {
        this.achtergrondkleur = achtergrondkleur;
    }

    public int[] getOmtrekkleur() {
        return omtrekkleur;
    }

    public void setOmtrekkleur(int[] omtrekkleur) {
        this.omtrekkleur = omtrekkleur;
    }

    public double berekenOmtrek() {
        return lengteZijde1 + lengteZijde2 + lengteZijde3;
    }

    public String toString() {
        return String.format("De zijden hebben de lengtes %s, %s en %s, die ervoor zorgen dat de driehoek een omtrek van %s heeft", lengteZijde1, lengteZijde2, lengteZijde3, berekenOmtrek());
    }
}
