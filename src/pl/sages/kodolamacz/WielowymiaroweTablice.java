package pl.sages.kodolamacz;

import java.util.Arrays;

public class WielowymiaroweTablice {

    public static void main(String[] args) {
        int[][] tab = new int[3][2];
        tab[0][0] = 1;
        tab[0][1] = 2;
        tab[1][0] = 3;
        tab[1][1] = 4;
        tab[2][0] = 5;
        tab[2][1] = 6;

        int[][] tab2 = new int[3][];
        tab2[0] = new int[5];
        tab2[1] = new int[15];
        tab2[2] = new int[25];

        int[][] tab3 = {{1,2}, {3,4}, {5,6}};

        System.out.println("tablica 1");
        for (int i = 0; i < tab.length; i++) {
            int[] ints = tab[i];
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("tablica 2");
        for (int i = 0; i < tab3.length; i++) {
            int[] ints = tab3[i];
            System.out.println(Arrays.toString(ints));
        }
    }

}
