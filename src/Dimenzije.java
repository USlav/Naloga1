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
}