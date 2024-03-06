package si.feri.opj.slavinec.razredi;

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

    @Override
    public String toString() {
        return "Depo{naziv='" + naziv + "\'}";
    }
}
