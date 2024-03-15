package si.feri.opj.slavinec.razredi;

class PremiumSkladisce extends Depo {
    private boolean kamera;

    public PremiumSkladisce(String naziv, String lokacija, int stPosiljk, boolean kamera) {
        super(naziv, lokacija, stPosiljk);
        this.kamera = kamera;
    }

    public void setKamera(boolean kamera) {
        this.kamera = kamera;
    }

    public double vrniCenoSkladiscenja() {
        double osnovnaCena = 1000;
        if (kamera) {
            return osnovnaCena * 2;
        } else {
            return osnovnaCena;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Kamera: " + kamera;
    }

}
