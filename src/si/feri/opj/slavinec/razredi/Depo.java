package si.feri.opj.slavinec.razredi;

public class Depo {
    private String naziv;
    private String lokacija;
    private Posiljka[] seznamPosiljk;

    public Depo() {
    }

    public Depo(String naziv, String lokacija) {

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
