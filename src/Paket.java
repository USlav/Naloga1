import java.time.LocalDate;

public class Paket {
    private String naziv;
    private Dimenzije dimenzije;
    private boolean dragocenost;
    private LocalDate datumOdposlanja;

    public Paket() {

    }

    public Paket(String naziv, LocalDate datumOdposlanja) {
        this.naziv = naziv;
        this.datumOdposlanja = datumOdposlanja;
    }

    public boolean getDragocenost() {
        return dragocenost;
    }

    public void setDragocenost(boolean dragocenost) {
        this.dragocenost = dragocenost;
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
