package si.feri.opj.slavinec.razredi;

class Skladisce extends Depo {

    public Skladisce(String naziv, String lokacija, int stPosiljk) {
        super(naziv, lokacija, stPosiljk);
    }

    @Override
    public double vrniCenoSkladiscenja() {
        double osnovnaCena = 100;
        return osnovnaCena;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
