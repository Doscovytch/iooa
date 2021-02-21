package week2.opdracht1_Figuren;

public class Vierhoek implements Figuurinterface{
    double lengteZijde1 = 1.0;
    double lengteZijde2 = 1.0;
    int[] achtergrondkleur = {255,255,255};
    int[] omtrekkleur = {0,0,0};

    public Vierhoek() {}

    public Vierhoek(double lengteZijde1, double lengteZijde2, int[] achtergrondkleur, int[] omtrekkleur) {
        this.lengteZijde1 = lengteZijde1;
        this.lengteZijde2 = lengteZijde2;
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
        return lengteZijde1*2+lengteZijde2*2;
    }

    public String toString() {
        return String.format("De zijden hebben elk een lengte van %s en %s, die ervoor zorgen dat het vierkant een omtrek van %s heeft", lengteZijde1, lengteZijde2, berekenOmtrek());
    }
}
