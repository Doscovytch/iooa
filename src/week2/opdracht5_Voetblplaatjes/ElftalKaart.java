package week2.opdracht5_Voetblplaatjes;

public class ElftalKaart extends Kaart{
    private String[] namen;
    private String quote;

    public ElftalKaart(String[] namen, String quote, long id, Foto foto) {
        super(id, foto);
        this.namen = namen;
        this.quote = quote;
    }

    public String[] getNamen() {
        return namen;
    }

    public void setNamen(String[] namen) {
        this.namen = namen;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
