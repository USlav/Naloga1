import java.time.LocalDate;

public class Zagonski {
    public static void main(String[] args) {
        Dimenzije dimenzijeObj = new Dimenzije(4.5, 3.0, 3.0);
        Artikel artikelObj = new Artikel("Laptop lenovo Yoga", dimenzijeObj);
        Dimenzije dimenzijeObjekt = new Dimenzije(3, 3.0, 3.0);
        Zaboj zabojObj = new Zaboj("Škatla", dimenzijeObjekt);
        Paket paketObj = new Paket("Laptop", LocalDate.now());
        Depo depoObj = new Depo();

        artikelObj.setTeza(20.0);
        artikelObj.setCena(800.0);
        paketObj.setDragocenost(true);
        depoObj.setNaziv("Celje");

        System.out.println("Volumen dimenzij: " + dimenzijeObj.izracunajVolumen());
        System.out.println("Lahko naložimo artikel v zaboj? " + zabojObj.lahkoNaloziArtikel(artikelObj));
    }
}