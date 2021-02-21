package week2.opdracht1_Figuren;

public class Vierkant implements Figuurinterface{
    double lengteZijde1 = 1.0;
    int[] achtergrondkleur = {255,255,255};
    int[] omtrekkleur = {0,0,0};

    public Vierkant() {}

    public Vierkant(double lengteZijde1, int[] achtergrondkleur, int[] omtrekkleur) {
        this.lengteZijde1 = lengteZijde1;
        this.achtergrondkleur = achtergrondkleur;
        this.omtrekkleur = omtrekkleur;
    }

    public double getLengteZijde1() {
        return lengteZijde1;
    }

    public void setLengteZijde1(double lengteZijde1) {
        this.lengteZijde1 = lengteZijde1;
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
        return lengteZijde1*4;
    }

    public String toString() {
        return String.format("De zijden hebben elk een lengte van %s, die ervoor zorgen dat het vierkant een omtrek van %s heeft", lengteZijde1, berekenOmtrek());
    }
}
