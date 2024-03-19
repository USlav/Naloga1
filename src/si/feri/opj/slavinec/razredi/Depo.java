package si.feri.opj.slavinec.razredi;

import java.util.Arrays;

public abstract class Depo {
    private String naziv;
    private String lokacija;
    private Posiljka[] seznamPosiljk;

    public Posiljka[] getSeznamPosiljk() {
        return seznamPosiljk;
    }

    public Depo() {
    }

    public Depo(String naziv, String lokacija, int stPosiljk) {
        this.naziv = naziv;
        this.lokacija = lokacija;
        seznamPosiljk = new Posiljka[stPosiljk];

    }

    public void skladisciPosiljko(Posiljka posiljka) {
        for (int i = 0; i < seznamPosiljk.length; i++) {
            if (seznamPosiljk[i] == null) {
                seznamPosiljk[i] = posiljka;
                break;
            } else if (i == seznamPosiljk.length - 1) {
                System.out.println("Depo je poln. Ni mogoče dodati nove posiljke.");
            }
        }
    }

    public double vrniZasedenost() {
        double a = this.vrniSteviloShranjenihPosiljk();
        return (a / seznamPosiljk.length) * 100;
    }

    public int vrniSteviloShranjenihPosiljk() {
        int a = 0;
        for (int i = 0; i < seznamPosiljk.length; i++) {
            if (seznamPosiljk[i] != null) {
                a++;
            }
        }
        return a;
    }

    public abstract double vrniCenoSkladiscenja();

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Depo [naziv=" + naziv + ", lokacija=" + lokacija + ", seznamPosiljk=" + Arrays.toString(seznamPosiljk)
                + "]";
    }
}
