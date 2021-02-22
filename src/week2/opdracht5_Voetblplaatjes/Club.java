package week2.opdracht5_Voetblplaatjes;

public class Club {
    private String naam;
    private String kenmerk;
    private SpelerKaart[] spelers;
    private ElftalKaart[] elftallen;
    private Coach[] coaches;
    private Stadion stadion;
    private Foto clublogo;

    public Club(String naam, String kenmerk, SpelerKaart[] spelers, ElftalKaart[] elftallen, Coach[] coaches, Stadion stadion, Foto clublogo) {
        this.naam = naam;
        this.kenmerk = kenmerk;
        this.spelers = spelers;
        this.elftallen = elftallen;
        this.coaches = coaches;
        this.stadion = stadion;
        this.clublogo = clublogo;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getKenmerk() {
        return kenmerk;
    }

    public void setKenmerk(String kenmerk) {
        this.kenmerk = kenmerk;
    }

    public SpelerKaart[] getSpelers() {
        return spelers;
    }

    public void setSpelers(SpelerKaart[] spelers) {
        this.spelers = spelers;
    }

    public ElftalKaart[] getElftallen() {
        return elftallen;
    }

    public void setElftallen(ElftalKaart[] elftallen) {
        this.elftallen = elftallen;
    }

    public Coach[] getCoaches() {
        return coaches;
    }

    public void setCoaches(Coach[] coaches) {
        this.coaches = coaches;
    }

    public Stadion getStadion() {
        return stadion;
    }

    public void setStadion(Stadion stadion) {
        this.stadion = stadion;
    }

    public Foto getClublogo() {
        return clublogo;
    }

    public void setClublogo(Foto clublogo) {
        this.clublogo = clublogo;
    }
}
