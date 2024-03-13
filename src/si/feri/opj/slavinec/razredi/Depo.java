package si.feri.opj.slavinec.razredi;

public abstract class Depo {
    private String naziv;
    private String lokacija;
    private Posiljka[] seznamPosiljk;

    public Depo() {
    }

    public Depo(String naziv) {

        this.naziv = naziv;
    }

    public Depo(String naziv, String lokacija) {
        this.naziv = naziv;
        this.lokacija = lokacija;
    }

    public Depo(String naziv, String lokacija, int stPosiljk) {
        this(naziv, lokacija);
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
        return (vrniSteviloShranjenihPosiljk() / seznamPosiljk.length) * 100;
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
        return "Depo{naziv='" + naziv + "\'}";
    }
}

class PremiumSkladisce extends Depot {
    // Razredni atributi
    private boolean kamera;

    // Konstruktor
    public PremiumSkladisce(String naziv, String lokacija, int stPosiljk, boolean kamera) {
        super(naziv, lokacija);
        this.kamera = kamera;
    }

    // Implementacija abstraktne metode za preračun osnovne cene skladiščenja
    @Override
    public double vrniCenoSkladiscenja() {
        // Implementacija cene skladiščenja za premium skladišče
        // Dummy implementation za prikaz
        return 50; // Predpostavimo fiksno ceno za premium skladišče
    }
}

// Podrazred Skladisce
class Skladisce extends Depot {
    // Konstruktor
    public Skladisce(String naziv, String lokacija, int stPosiljk) {
        super(naziv, lokacija);
    }

    // Implementacija abstraktne metode za preračun osnovne cene skladiščenja
    @Override
    public double vrniCenoSkladiscenja() {
        // Implementacija cene skladiščenja za običajno skladišče
        // Dummy implementation za prikaz
        return 30; // Predpostavimo fiksno ceno za običajno skladišče
    }
}