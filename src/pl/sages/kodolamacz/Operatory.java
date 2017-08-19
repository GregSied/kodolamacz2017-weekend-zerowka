package pl.sages.kodolamacz;

public class Operatory {

    public static void main(String[] args) {
        int a = 10;
        a = 20;
        // java jest językiem silnie typowanym
        // nie można zmienić typu zmiennej
        // a = "ab";

        a = a + 15;
        a = a - 8;
        int b = a * 10;
        int c = a / 3; // dzielenie calkowite
        int d = a / 4; // dzielenie calkowite
        double e = a / 4.0; // dzielimy przez rzeczywistą
        int f = a % 4; // dzielenie modulo
        System.out.println("a=" + a);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        System.out.println("e=" + e);
        System.out.println("f=" + f);
        System.out.println(a+ " = 4 * " + d + " + " + f);

        System.out.println(Math.pow(4, 3));

        System.out.println(1 << 4);

        int i = 0;
        // poniższe linijki mają taki sam efekt
        i = i + 1;
        i++;

        // porównywanie
        System.out.println( a > 15);
        System.out.println( a >= 15);
        System.out.println( a < 15);
        System.out.println( a <= 15);

        System.out.println( a > 20 || a < 5);
        // (-niesk, 4] , 7 , [21, +niesk)
        System.out.println( a > 20 || a < 5 || a == 7);

        // LUB
        System.out.println(true | false);
        System.out.println(false | false);

        // I (ORAZ)
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);

        // podwójne operatory są LENIWE
        System.out.println(true || false);

        System.out.println("Zwykły");
        System.out.println(true | czasochlonna());
        System.out.println("Leniwy");
        System.out.println(true || czasochlonna());

        System.out.println("Leniwy AND");
        System.out.println(false && czasochlonna());

    }

    public static boolean czasochlonna(){
        System.out.println("Teraz licze trudne rzeczy");
        return true;
    }


}
