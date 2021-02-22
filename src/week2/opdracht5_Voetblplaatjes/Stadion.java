package week2.opdracht5_Voetblplaatjes;

public class Stadion extends Kaart{
    private String naam;
    private long capaciteit;

    public Stadion(long id, Foto foto, String naam, long capaciteit) {
        super(id, foto);
        this.naam = naam;
        this.capaciteit = capaciteit;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public long getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(long capaciteit) {
        this.capaciteit = capaciteit;
    }
}
