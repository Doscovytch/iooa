package week2.opdracht2_Personen;

public class Opleiding {
    private String naam;
    private String plaats;

    private Docent docent = new Docent("Kees", 11, 1.55, 75);
    private Onderwijsmanager onderwijsmanager = new Onderwijsmanager("Stop", 22, 2, 90);

    public Opleiding(String naam, String plaats) {
        this.naam = naam;
        this.plaats = plaats;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public Docent getDocent() {
        return docent;
    }

    public void setDocent(Docent docent) {
        this.docent = docent;
    }

    public Onderwijsmanager getOnderwijsmanager() {
        return onderwijsmanager;
    }

    public void setOnderwijsmanager(Onderwijsmanager onderwijsmanager) {
        this.onderwijsmanager = onderwijsmanager;
    }
}
