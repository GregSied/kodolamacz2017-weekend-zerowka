package pl.sages.kodolamacz.poza;

import pl.sages.kodolamacz.dostep.PoziomyDostepu;

public class Dziedziczona extends PoziomyDostepu{

    public static void main(String[] args) {
        // widzi chronioną, chociaż nie są w tym samym pakiecie
        // ale DZIEDZICZY po klasie PoziomyDostępu
        PoziomyDostepu.chroniona();

        // nie jest widoczna poza swoim pakietem
//        DrugaKlasa
    }

}
