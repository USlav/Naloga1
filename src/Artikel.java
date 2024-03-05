public class Artikel {
    private String naziv;
    private Dimenzije dimenzije;
    private double teza;
    private double cena;

    public Artikel(String naziv, Dimenzije dimenzije) {
        this.naziv = naziv;
        this.dimenzije = dimenzije;
    }

    public Artikel(String naziv, Dimenzije dimenzije, double teza, double cena) {
        this(naziv, dimenzije);
        this.teza = teza;
        this.cena = cena;
    }

    public Dimenzije getDimenzije() {
        return dimenzije;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setTeza(double teza) {
        this.teza = teza;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String toString() {
        return "Artikel{" + "naziv='" + naziv + '\'' + ", dimenzije=" + dimenzije + ", teza=" + teza + ", cena=" + cena
                + '}';
    }
}
