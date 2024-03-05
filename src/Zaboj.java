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

    public void dodajArtikel(Artikel artikel) {
        for (int i = 0; i < seznamArtiklov.length; i++) {
            if (seznamArtiklov[i] == null) {
                seznamArtiklov[i] = artikel;
            } else if (i == seznamArtiklov.length - 1) {
                System.out.println("Zaboj je poln. Ni mogoče dodati novega artikla.");
            }
        }
    }

    public void odstraniArtikel(Artikel artikel) {
        for (int i = 0; i < seznamArtiklov.length; i++) {
            if (seznamArtiklov[i] == artikel) {
                seznamArtiklov[i] = null;
            } else if (i == seznamArtiklov.length - 1) {
                System.out.println("Tega artikla ni v zaboju.");
            }
        }
    }

    public boolean odstraniArtikel(String naziv) {
        for (int i = 0; i < seznamArtiklov.length; i++) {
            if (seznamArtiklov[i].getNaziv() == naziv) {
                seznamArtiklov[i] = null;
                return true;
            }
        }
        return false;
    }

    public int vrniSteviloArtiklov() {
        int a = 0;
        for (int i = 0; i < seznamArtiklov.length; i++) {
            if (seznamArtiklov[i] != null) {
                a++;
            }
        }
        return a;
    }

    public boolean artikelObstaja(Artikel artikel) {
        for (int i = 0; i < seznamArtiklov.length; i++) {
            if (seznamArtiklov[i] == artikel) {
                return true;
            }
        }
        return false;
    }

    public boolean lahkoNaloziArtikel(Artikel artikel) {
        return artikel.getDimenzije().izracunajVolumen() <= dimenzije.izracunajVolumen();
    }

}
