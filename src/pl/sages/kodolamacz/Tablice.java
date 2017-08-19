package pl.sages.kodolamacz;

import java.util.Arrays;

public class Tablice {

    public static void main(String[] args) {
        int zmienna1 = 1;
        int zmienna2 = 3;
        int zmienna3 = 17;

        int[] tablica = new int[10];
        tablica[0] = 42;
        tablica[1] = 17;
        tablica[5] = -15;
        System.out.println(zmienna1);
        System.out.println(Arrays.toString(tablica));
        System.out.println(tablica[1] + tablica[5]);
    }

}
