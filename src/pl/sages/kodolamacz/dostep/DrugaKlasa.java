package pl.sages.kodolamacz.dostep;

// klasa widoczna tylko w pakiecie pl.sages.kodolamacz.dostep
class DrugaKlasa {

    public static void main(String[] args) {
        // publiczna widoczna bo zawsze widoczna
        PoziomyDostepu.publiczna();
        // a te dwie widoczne bo ten sam pakiet
        PoziomyDostepu.chroniona();
        PoziomyDostepu.domyslny();
    }

}
