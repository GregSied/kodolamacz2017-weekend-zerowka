package pl.sages.kodolamacz.dziedziczenie;

import java.math.BigInteger;

public class Overloading {

    public static long twice(int i){
        System.out.println("integer");
        return 2 * i;
    }

    public static long twice(long i){
        System.out.println("long");
        return 2 * i;
    }

    public static double twice(float i){
        System.out.println("double");
        return 2 * i;
    }
//  to nie działa - metody nie mogą różnić się tylko zwracanym typem
//    public static double quadro(float i){
//        return 4*i;
//    }
//
//    public static float quadro(float i){
//        return 4*i;
//    }

    public static void main(String[] args) {
        int a = 5;
        long c = 100_000_000_000L;

        twice(a);
        twice(c);
        double pi = 3.14;
        float e = 2.73f;
        twice((float) pi);
        twice(e);


        int i = 1;
        System.out.println("MIN="+Integer.MIN_VALUE);
        System.out.println("MAX="+Integer.MAX_VALUE);
        for(int j = 0; j < 65; j++){
            System.out.println(i);
            i = i * 3;
        }

        BigInteger big1 = new BigInteger("123");
        BigInteger big2 = new BigInteger("123");

        big1.add(big2);
    }

}
