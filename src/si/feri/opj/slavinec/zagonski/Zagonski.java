package si.feri.opj.slavinec.zagonski;

import java.time.LocalDate;

import si.feri.opj.slavinec.razredi.Artikel;
import si.feri.opj.slavinec.razredi.Depo;
import si.feri.opj.slavinec.razredi.Paket;
import si.feri.opj.slavinec.razredi.Zaboj;
import si.feri.opj.slavinec.razredi.Dimenzije;

/**
 * 
 * Razred za demonstracijo delovanja
 *
 * @author Urh Slavinec
 * @version 1.0
 */
public class Zagonski {
    public static void main(String[] args) {
        Dimenzije dimenzijeArtikel = new Dimenzije(4.5, 3.0, 3.0);
        Dimenzije dimenzijeZaboj = new Dimenzije(3.0, 3.0, 3.0);
        Zaboj zabojObj = new Zaboj("Škatla", dimenzijeZaboj, LocalDate.now());
        Paket paketObj = new Paket("Laptop", LocalDate.now());
        Depo depoObj = new Depo();
        Artikel artikelObj = new Artikel("Laptop lenovo Yoga", dimenzijeArtikel);
        Artikel artikelObj2 = new Artikel("Telefon S20", dimenzijeArtikel, 0.2, 900.0);

        artikelObj.setTeza(20.0);
        artikelObj.setCena(800.0);
        paketObj.setDragocenost(true);
        depoObj.setNaziv("Celje");

        zabojObj.dodajArtikel(artikelObj);
        zabojObj.dodajArtikel(artikelObj2);
        zabojObj.dodajArtikel(new Artikel("Telefon Samsung S10", new Dimenzije(2.0, 1.0, 1.0), 0.2, 400.0));
        zabojObj.odstraniArtikel(artikelObj);
        zabojObj.odstraniArtikel("Telefon S20");

        System.out.println("Volumen dimenzij: " + dimenzijeArtikel.izracunajVolumen());
        System.out.println("Lahko naložimo artikel v zaboj? " +
                zabojObj.lahkoNaloziArtikel(artikelObj));
        System.out.println("Implementacija toString: " + zabojObj.toString());
        System.out.println("Število artiklov: " + zabojObj.vrniSteviloArtiklov());
        System.out.println("Ali artikel že obstaja: " + zabojObj.artikelObstaja(artikelObj));

    }
}