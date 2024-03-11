package si.feri.opj.slavinec.razredi;

import java.time.LocalDate;
import java.util.Arrays;

public class Zaboj extends Posiljka {

    public Zaboj(String naziv, Dimenzije dimenzije, LocalDate datumOdposlanja) {
        super(naziv, dimenzije, datumOdposlanja);

    }

    @Override
    public String toString() {
        return "Zaboj{" + "naziv='" + getNaziv() + '\'' + ", dimenzije=" + getDimenzije() + ", datumOdposlanja="
                + getDatumOdposlanja() + ", seznamArtiklov=" + Arrays.toString(getSeznamArtiklov()) + '}';

    }
}
