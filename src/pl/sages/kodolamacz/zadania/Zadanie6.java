package pl.sages.kodolamacz.zadania;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Zadanie6 {

    public static void main(String[] args) {
        int[][] tab = { {3,8,16},
                        {1,22,28,24},
                        {3},
                        {41,42}};

        int min = tab[0][0];
        int max = tab[0][0];

        // a co jeśli tak jak u nas min == 1 ?
        // int min = 0; to będzie niestety źle
        // int max = 0;

        // lepiej tak:
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;

        // albo nawet tak:
//        Optional<Integer> optional1 = Optional.of(43);
//        Optional<Integer> optional2 = Optional.empty();

        for (int[] ints : tab) {
            for (int i : ints) {
                min = Math.min(i, min);
                max = Math.max(i, max);
            }
        }

        System.out.println("Min ="+min);
        System.out.println("Max ="+max);
    }

}
