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

    public void setDragocenost(boolean dragocenost) {
        this.dragocenost = dragocenost;
    }
}
