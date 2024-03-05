public class Artikel {
    private String naziv;
    private Dimenzije dimenzije;
    private double teza;
    private double cena;

    public Artikel(String naziv, Dimenzije dimenzije) {
        this.naziv = naziv;
        this.dimenzije = dimenzije;
    }

    public Dimenzije getDimenzije() {
        return dimenzije;
    }

    public void setTeza(double teza) {
        this.teza = teza;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

}
