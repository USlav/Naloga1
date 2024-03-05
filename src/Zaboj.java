import java.time.LocalDate;

public class Zaboj {
    private String naziv;
    private Dimenzije dimenzije;
    private LocalDate datumOdposlanja;
    private Artikel[] seznamArtiklov = new Artikel[5];

    public Zaboj() {
    }

    public Zaboj(String naziv, Dimenzije dimenzije) {
        this.naziv = naziv;
        this.dimenzije = dimenzije;
    }

    public boolean lahkoNaloziArtikel(Artikel artikel) {
        return artikel.getDimenzije().izracunajVolumen() <= dimenzije.izracunajVolumen();
    }

}
