import java.time.LocalDate;
public class Zagonski {
    public static void main(String[] args) {
        Dimenzije dimenzijeObj = new Dimenzije(2.5, 1.0, 3.0);
        Artikel artikelObj = new Artikel("Laptop", dimenzijeObj);
        Zaboj zabojObj = new Zaboj("Škatla", dimenzijeObj);
        Paket paketObj = new Paket("Darilo", LocalDate.now());
        Depo depoObj = new Depo();

        artikelObj.setTeza(2.0);
        artikelObj.setCena(800.0);
        paketObj.setDragocenost(true);
        depoObj.setNaziv("Celje");

        System.out.println("Volumen dimenzij: " + dimenzijeObj.izracunajVolumen());
        System.out.println("Lahko naložimo artikel v zaboj? " + zabojObj.lahkoNaloziArtikel(artikelObj));
    }
}