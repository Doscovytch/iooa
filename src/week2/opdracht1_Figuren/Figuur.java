package week2.opdracht1_Figuren;

public abstract class Figuur implements Figuurinterface{
    double[] zijden;
    int[] achtergrondkleur = {255,255,255};
    int[] omtrekkleur = {0,0,0};

    public Figuur() {}

    public Figuur(double[] zijden, int[] achtergrondkleur, int[] omtrekkleur) {
        this.zijden = zijden;
        this.achtergrondkleur = achtergrondkleur;
        this.omtrekkleur = omtrekkleur;
    }

    public double[] getZijden() {
        return zijden;
    }

    public void setZijden(double[] zijden) {
        this.zijden = zijden;
    }

    @Override
    public int[] getAchtergrondkleur() {
        return achtergrondkleur;
    }

    @Override
    public void setAchtergrondkleur(int[] achtergrondkleur) {
        this.achtergrondkleur = achtergrondkleur;
    }

    @Override
    public int[] getOmtrekkleur() {
        return omtrekkleur;
    }

    @Override
    public void setOmtrekkleur(int[] omtrekkleur) {
        this.omtrekkleur = omtrekkleur;
    }

    @Override
    public double berekenOmtrek() {
        double result = 0;
        for (double lengte : zijden) {
            result += lengte;
        }
        return result;
    }

    public String toString() {
        StringBuilder lengteZijden = new StringBuilder();
        for(int i = 0; i < zijden.length-1; i++) {
            lengteZijden.append(zijden[i]).append(", ");
        }
        lengteZijden.append("en ").append(zijden[zijden.length - 1]);
        return String.format("De zijden hebben elk een lengte van %s,die ervoor zorgen dat het figuur een omtrek van %s heeft.", lengteZijden.toString(), berekenOmtrek());
    }
}
