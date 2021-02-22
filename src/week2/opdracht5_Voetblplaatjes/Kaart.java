package week2.opdracht5_Voetblplaatjes;

public abstract class Kaart {
    private long id;
    private Foto foto;

    public Kaart(long id, Foto foto) {
        this.id = id;
        this.foto = foto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }
}
