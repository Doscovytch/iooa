package week2.opdracht5_Voetblplaatjes;

public class Voetbalplaatjesalbum {
    private String titel = "het voetbalplaatjesalbum 2018-2019";
    private String subtitel = "alle talenten verzamelen!";
    private Club[] clubs;

    public Voetbalplaatjesalbum() {}

    public Voetbalplaatjesalbum(Club[] clubs) {
        this.clubs = clubs;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getSubtitel() {
        return subtitel;
    }

    public void setSubtitel(String subtitel) {
        this.subtitel = subtitel;
    }

    public Club[] getClubs() {
        return clubs;
    }

    public void setClubs(Club[] clubs) {
        this.clubs = clubs;
    }
}
