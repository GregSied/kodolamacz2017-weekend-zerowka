package pl.sages.kodolamacz;

import pl.sages.kodolamacz.zadania.Plec;

enum Status{
    NOWE,
    OPLACONE,
    WYSLANE
}

public class TypyWyliczeniowe {

    public static void main(String[] args) {
        boolean plec = true; // jak true to kobieta czy mężczyzna?
        boolean jestKobieta = true;

        int nowe = 0;
        int oplacone = 1;
        int wyslane = 2;
        int status = 55;

        Status zamowienie = Status.NOWE;

        Plec plec1 = Plec.KOBIETA;
    }

}

class DrugaKlasa{
    public static void main(String[] args) {

    }
}
