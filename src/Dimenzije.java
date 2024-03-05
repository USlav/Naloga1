public class Dimenzije {
    private double visina;
    private double sirina;
    private double dolzina;

    public Dimenzije(double visina, double sirina, double dolzina) {
        this.visina = visina;
        this.sirina = sirina;
        this.dolzina = dolzina;
    }

    /*
     * public double getVisina() {
     * return visina;
     * }
     * 
     * public void setVisina(double visina) {
     * this.visina = visina;
     * }
     * 
     * public double getSirina() {
     * return sirina;
     * }
     * 
     * public void setSirina(double sirina) {
     * this.sirina = sirina;
     * }
     * 
     * public double getDolzina() {
     * return dolzina;
     * }
     * 
     * public void setDolzina(double dolzina) {
     * this.dolzina = dolzina;
     * }
     */
    public double izracunajVolumen() {
        return visina * sirina * dolzina;
    }
}