package si.feri.opj.slavinec.zagonski;

import java.time.LocalDate;

import si.feri.opj.slavinec.razredi.Artikel;
import si.feri.opj.slavinec.razredi.Depo;
import si.feri.opj.slavinec.razredi.Paket;
import si.feri.opj.slavinec.razredi.Zaboj;
import si.feri.opj.slavinec.razredi.Dimenzije;

public class Zagonski {
    public static void main(String[] args) {
        Dimenzije dimenzijeArtikel = new Dimenzije(4.5, 3.0, 3.0);
        Artikel artikelObj = new Artikel("Laptop lenovo Yoga", dimenzijeArtikel);
        Dimenzije dimenzijeZaboj = new Dimenzije(3, 3.0, 3.0);
        Zaboj zabojObj = new Zaboj("Škatla", dimenzijeZaboj, LocalDate.of(2003, 05, 23));
        Paket paketObj = new Paket("Laptop", LocalDate.now());
        Depo depoObj = new Depo();

        artikelObj.setTeza(20.0);
        artikelObj.setCena(800.0);
        paketObj.setDragocenost(true);
        depoObj.setNaziv("Celje");

        System.out.println("Volumen dimenzij: " + dimenzijeArtikel.izracunajVolumen());
        System.out.println("Lahko naložimo artikel v zaboj? " +
                zabojObj.lahkoNaloziArtikel(artikelObj));
    }
}