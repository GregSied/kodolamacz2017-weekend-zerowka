package pl.sages.kodolamacz;

public class TypyZmiennych {

    public static void main(String[] args) {
        boolean prawda = true;
        boolean falsz = false;
        byte bajt1 = 127; // ~ +/- 128
        byte bajt2 = -128;
        short krotki = 1; // ~ +/-65 000
        int calkowita = 123; // +/-2^31
        long duzaCalkowita = 500; // +/- 2^63

        float rzeczywista = 3.14f;
        double rzeczywistaDokladniejsza = 3.1415;

        System.out.println(0.3 == 0.3);
        System.out.println(0.1 + 0.1 + 0.1 == 0.3);
        System.out.println(0.1 + 0.1 + 0.1 - 0.3);
        // dla znaku musi być pojedynczy
        char znak = 'a';
        // podwójny cudzysłów tylko dla napisów
        //char znak1 = "a";

        String napis = "Ala ma kota";

        System.out.println("Czy A jest równe 65?");
        System.out.println('A' == 65);




    }

}
