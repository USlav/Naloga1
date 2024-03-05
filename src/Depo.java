public class Depo {
    private String naziv;

    public Depo() {
    }

    public Depo(String naziv) {
        this.naziv = naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String toString() {
        return "Depo{naziv='" + naziv + "\'}";
    }
}
