package si.feri.opj.slavinec.zagonski;

import java.time.LocalDate;

import si.feri.opj.slavinec.razredi.Artikel;
import si.feri.opj.slavinec.razredi.Depo;
import si.feri.opj.slavinec.razredi.Paket;
import si.feri.opj.slavinec.razredi.Zaboj;
import si.feri.opj.slavinec.razredi.Dimenzije;
import si.feri.opj.slavinec.razredi.Skladisce;
import si.feri.opj.slavinec.razredi.PremiumSkladisce;
import si.feri.opj.slavinec.razredi.OznakaZaboja;

public class Zagonski {
    public static void main(String[] args) {
        Dimenzije dimenzijeArtikel = new Dimenzije(1.5, 3.0, 3.0);
        Dimenzije dimenzijeZaboj = new Dimenzije(3.0, 3.0, 3.0);
        Zaboj zabojObj = new Zaboj("Škatla", dimenzijeZaboj, LocalDate.now());
        Paket paketObj = new Paket("Laptop", LocalDate.now());
        Artikel artikelObj = new Artikel("Laptop lenovo Yoga", dimenzijeArtikel);
        Artikel artikelObj2 = new Artikel("Telefon S20", dimenzijeArtikel, 0.2, 900.0);

        int stPosiljk = 5;
        Depo depo;
        depo = new PremiumSkladisce("Gorenje", "Velenje", stPosiljk, true);

        artikelObj.setTeza(20.0);
        artikelObj.setCena(800.0);
        paketObj.setDragocenost(true);

        zabojObj.dodajArtikel(artikelObj);
        zabojObj.dodajArtikel(artikelObj2);
        zabojObj.dodajArtikel(new Artikel("Telefon Samsung S10", new Dimenzije(2.0, 1.0, 1.0), 0.2, 400.0));

        System.out.println("Volumen dimenzij artikla: " + dimenzijeArtikel.izracunajVolumen());
        System.out.println("Lahko naložimo artikel v zaboj? " + zabojObj.lahkoNaloziArtikel(artikelObj));
        System.out.println("Implementacija toString: " + zabojObj.toString());
        System.out.println("Število artiklov: " + zabojObj.vrniSteviloArtiklov());
        System.out.println("Ali artikel že obstaja: " + zabojObj.artikelObstaja(artikelObj));

        zabojObj.setOznaka(OznakaZaboja.LOMLJIVO);
        depo.skladisciPosiljko(zabojObj);
        depo.skladisciPosiljko(paketObj);

        System.out.println("Zasedenost Depoja: " + depo.vrniZasedenost() + "%");
        System.out.println("Stevilo posiljk v depoju: " + depo.vrniSteviloShranjenihPosiljk() + "?");
        System.out.println("Cena skladiscenja: " + depo.vrniCenoSkladiscenja() + "€");

    }
}