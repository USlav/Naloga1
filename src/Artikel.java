public class Artikel {
    private String naziv;
    private Dimenzije dimenzije;
    private double teza;
    private double cena;

    public Artikel(String naziv, Dimenzije dimenzije) {
        this.naziv = naziv;
        this.dimenzije = dimenzije;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Dimenzije getDimenzije() {
        return dimenzije;
    }

    public void setDimenzije(Dimenzije dimenzije) {
        this.dimenzije = dimenzije;
    }

    public double getTeza() {
        return teza;
    }

    public void setTeza(double teza) {
        this.teza = teza;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }


}
