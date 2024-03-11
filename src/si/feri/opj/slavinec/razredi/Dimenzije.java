package si.feri.opj.slavinec.razredi;

/**
 * 
 * Razred Dimenzije
 *
 * @author Urh Slavinec
 * @version 1.0
 */
public class Dimenzije {
    private double visina;
    private double sirina;
    private double dolzina;

    /**
     * Konstruktor razreda dimenzije
     * 
     * @param visina  visina artikla oz. zaboja
     * @param sirina  sirina artikla oz.zaboja
     * @param dolzina dolzinia artikla oz.zaboja
     */
    public Dimenzije(double visina, double sirina, double dolzina) {
        this.visina = visina;
        this.sirina = sirina;
        this.dolzina = dolzina;
    }

    /**
     * metoda ki vrne volumen
     * 
     * @return vrne rezultat tipa double
     */
    public double izracunajVolumen() {
        return visina * sirina * dolzina;
    }

    @Override
    public String toString() {
        return "Dimenzije{" + "visina=" + visina + ", sirina=" + sirina + ", dolzina=" + dolzina + '}';
    }
}