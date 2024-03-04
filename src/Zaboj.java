import java.time.LocalDate;

public class Zaboj {
    private String naziv;
    private Dimenzije dimenzije;
    private LocalDate datumOdposlanja;

    public Zaboj() {

    }

    public Zaboj(String naziv, Dimenzije dimenzije) {
        this.naziv = naziv;
        this.dimenzije = dimenzije;
    }

    public boolean lahkoNaloziArtikel(Artikel artikel) {
        return artikel.getDimenzije().izracunajVolumen() <= dimenzije.izracunajVolumen();
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

    public LocalDate getDatumOdposlanja() {
        return datumOdposlanja;
    }

    public void setDatumOdposlanja(LocalDate datumOdposlanja) {
        this.datumOdposlanja = datumOdposlanja;
    }
}
