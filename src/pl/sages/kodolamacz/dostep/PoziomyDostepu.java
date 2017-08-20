package pl.sages.kodolamacz.dostep;

// publiczną klasę widzą wszyscy
public class PoziomyDostepu {

    // publiczna metode widzą wszyscy
    public static void main(String[] args) {
        new Prywatna();
    }

    // wszyscy widzą
    public static void publiczna(){

    }

    // ten sam pakiet + klasy ktore dziedziczą po mojej klasie
    protected static void chroniona(){

    }

    // ten sam pakiet
    static void domyslny(){

    }

    // tylko moja klasa
    private static void prywatna(){

    }

    // klasy mogą być prywatne, ale tylko jeśli są w INNEJ KLASIE
    private static class Prywatna{

    }
}

class Druga{
    public static void main(String[] args) {
        PoziomyDostepu.publiczna();
        PoziomyDostepu.chroniona();
        PoziomyDostepu.domyslny();
    }
}