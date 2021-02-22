package week2.opdracht5_Voetblplaatjes;

public class Coach extends Kaart{
    private String voornaam;
    private String achternaam;
    private String quote;
    private String kenmerk;
    private Foto foto;

    public Coach(long id, Foto foto, String voornaam, String achternaam, String quote, String kenmerk, Foto foto1) {
        super(id, foto);
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.quote = quote;
        this.kenmerk = kenmerk;
        this.foto = foto1;
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

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }
}
