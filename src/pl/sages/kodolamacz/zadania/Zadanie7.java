package pl.sages.kodolamacz.zadania;

import java.util.Arrays;

public class Zadanie7 {

    public static int pozycjaPodzielnejPrzez(int[] tab, int x){
        //TODO - dokończyć
        int pozycja = -1;
        for (int index = 0; index < tab.length; index++) {
            int value = tab[index];
            if(value % x == 0){
                pozycja = index;
                break;
            }
        }
        return pozycja;
    }

    public static void main(String[] args) {
        int[] tab = {1, 6, 4, 12, 13, 66, 44};
        System.out.println(pozycjaPodzielnejPrzez(tab, 6));
        System.out.println(pozycjaPodzielnejPrzez(tab, 13));
        System.out.println(pozycjaPodzielnejPrzez(tab, 22));
    }

}
