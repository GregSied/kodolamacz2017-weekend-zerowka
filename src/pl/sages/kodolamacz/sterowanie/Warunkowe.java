package pl.sages.kodolamacz.sterowanie;

public class Warunkowe {

    public static void main(String[] args) {
        int age = 19;

        // jeżeli zachodzi
        if (age >= 21) {
            //to zrób to
            System.out.println("jesteś pełnoletni wszędzie");
        } else if (age >= 18) {
            System.out.println("jesteś pełnoletni w europie");
        } else { // w przeciwnym wypadku
            // zrób to
            System.out.println("jesteś nieletni");
        }
    }

}

