package si.feri.opj.slavinec.razredi;

import java.time.LocalDate;
import java.util.Arrays;

public class Posiljka implements Transportni {
    private String naziv;
    private Dimenzije dimenzije;
    private LocalDate datumOdposlanja;
    private Artikel[] seznamArtiklov;

    public Posiljka() {
        seznamArtiklov = new Artikel[5];
    }

    public Posiljka(String naziv, Dimenzije dimenzije, LocalDate datumOdposlanja) {
        this(naziv, datumOdposlanja);
        this.dimenzije = dimenzije;
    }

    public Posiljka(String naziv, LocalDate datumOdposlanja) {
        this();
        this.naziv = naziv;
        this.datumOdposlanja = datumOdposlanja;
    }

    public boolean lahkoNatovori(Dimenzije dimenzijeVozila) {
        double skupnaDolzina = 0;
        double skupnaVisina = 0;
        double skupnaSirina = 0;

        for (Artikel artikel : seznamArtiklov) {
            if (artikel != null) {
                skupnaDolzina += artikel.getDimenzije().getDolzina();
                skupnaVisina += artikel.getDimenzije().getVisina();
                skupnaSirina += artikel.getDimenzije().getSirina();
            }
        }
        if (skupnaDolzina < dimenzijeVozila.getDolzina() && skupnaSirina < dimenzijeVozila.getSirina()
                && skupnaVisina < dimenzijeVozila.getVisina()) {
            return true;
        }
        return false;
    }

    public void dodajArtikel(Artikel artikel) {
        for (int i = 0; i < seznamArtiklov.length; i++) {
            if (seznamArtiklov[i] == null) {
                seznamArtiklov[i] = artikel;
                break;
            } else if (i == seznamArtiklov.length - 1) {
                System.out.println("Zaboj je poln. Ni mogoče dodati novega artikla.");
            }
        }
    }

    public void odstraniArtikel(Artikel artikel) {
        for (int i = 0; i < seznamArtiklov.length; i++) {
            if (seznamArtiklov[i] == artikel) {
                seznamArtiklov[i] = null;
                break;
            } else if (i == seznamArtiklov.length - 1) {
                System.out.println("Tega artikla ni v zaboju.");
            }
        }
    }

    public boolean odstraniArtikel(String naziv) {
        for (int i = 0; i < seznamArtiklov.length; i++) {
            if (seznamArtiklov[i] != null && seznamArtiklov[i].getNaziv().equals(naziv)) {
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
        int volumenVseh = 0;
        for (int i = 0; i < seznamArtiklov.length; i++) {
            if (seznamArtiklov[i] != null) {
                volumenVseh += seznamArtiklov[i].getDimenzije().izracunajVolumen();
            }
        }
        volumenVseh += artikel.getDimenzije().izracunajVolumen();

        return volumenVseh <= dimenzije.izracunajVolumen();
    }

    public String getNaziv() {
        return naziv;
    }

    public Dimenzije getDimenzije() {
        return dimenzije;
    }

    public LocalDate getDatumOdposlanja() {
        return datumOdposlanja;
    }

    public Artikel[] getSeznamArtiklov() {
        return seznamArtiklov;
    }

    @Override
    public String toString() {
        return "Posiljka [naziv=" + naziv + ", dimenzije=" + dimenzije + ", datumOdposlanja=" + datumOdposlanja
                + ", seznamArtiklov=" + Arrays.toString(seznamArtiklov) + "]";
    }
}
