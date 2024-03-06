package si.feri.opj.slavinec.razredi;

public class Dimenzije {
    private double visina;
    private double sirina;
    private double dolzina;

    public Dimenzije(double visina, double sirina, double dolzina) {
        this.visina = visina;
        this.sirina = sirina;
        this.dolzina = dolzina;
    }

    public double izracunajVolumen() {
        return visina * sirina * dolzina;
    }

    @Override
    public String toString() {
        return "Dimenzije{" + "visina=" + visina + ", sirina=" + sirina + ", dolzina=" + dolzina + '}';
    }
}