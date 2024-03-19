package si.feri.opj.slavinec.razredi;

import java.util.Arrays;

public abstract class Depo implements Transportni {
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

    public boolean lahkoNatovori(Dimenzije dimenzijeVozila) {
        double skupnaDolzina = 0;
        double skupnaVisina = 0;
        double skupnaSirina = 0;

        for (Posiljka posiljka : seznamPosiljk) {
            if (posiljka != null) {
                for (Artikel artikel : posiljka.getSeznamArtiklov()) {
                    if (artikel != null) {
                        skupnaDolzina += artikel.getDimenzije().getDolzina();
                        skupnaVisina += artikel.getDimenzije().getVisina();
                        skupnaSirina += artikel.getDimenzije().getSirina();
                    }
                }
            }
        }
        if (skupnaDolzina < dimenzijeVozila.getDolzina() && skupnaSirina < dimenzijeVozila.getSirina()
                && skupnaVisina < dimenzijeVozila.getVisina()) {
            return true;
        }
        return false;
    }

    public void skladisciPosiljko(Posiljka posiljka) throws SkladiscenjeException {
        if (posiljka instanceof Paket) {
            Paket paket = (Paket) posiljka;
            Depo depo = new PremiumSkladisce();
            if (paket.getDragocenost() && (depo instanceof PremiumSkladisce)) {
                PremiumSkladisce premiumSkladisce = (PremiumSkladisce) depo;
                if (!premiumSkladisce.getKamera()) {
                    throw new SkladiscenjeException("Premium skladišče " + naziv
                            + " nima kamere, zato ne more skladiščiti pošiljke " + posiljka.getNaziv());
                }
            }
        }
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
