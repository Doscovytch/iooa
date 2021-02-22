package week2.opdracht5_Voetblplaatjes;

public class SpelerKaart extends Kaart{
    private String voornaam;
    private String achternaam;
    private int rugnummer;
    private String quote;
    private String kenmerk;

    public SpelerKaart(long id, Foto foto, String voornaam, String achternaam, int rugnummer, String quote, String kenmerk) {
        super(id, foto);
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.rugnummer = rugnummer;
        this.quote = quote;
        this.kenmerk = kenmerk;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public int getRugnummer() {
        return rugnummer;
    }

    public void setRugnummer(int rugnummer) {
        this.rugnummer = rugnummer;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getKenmerk() {
        return kenmerk;
    }

    public void setKenmerk(String kenmerk) {
        this.kenmerk = kenmerk;
    }
}
