package week2.opdracht5_Voetblplaatjes;

public class Foto {
    private String locatie;
    private String naam;
    private String img;

    public Foto(String locatie, String naam, String img) {
        this.locatie = locatie;
        this.naam = naam;
        this.img = img;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
