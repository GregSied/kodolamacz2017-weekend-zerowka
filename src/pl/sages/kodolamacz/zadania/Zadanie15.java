package pl.sages.kodolamacz.zadania;

import java.util.Random;

public class Zadanie15 {

    public static void main(String[] args) {
        int licznik = 0;
        int k = 1_000_000;
        Random random = new Random(42);
        for (int i = 0; i < k; i++) {
            // sztuczka żeby przekształcić zakres [0,1] na [-1,1]
            double x = random.nextDouble() * 2 - 1;
            double y = random.nextDouble() * 2 - 1;
            // (x-a)^2 + (y-b)^2 <= r^2 gdzie (a,b) to srodek kola
            if(x*x + y*y <= 1){
                // jestesmy w kole
                licznik++;
            }
        }
        System.out.println(4.0 * licznik / k);
    }

}
