package pl.sages.kodolamacz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class CodeWars {

    public static String HighAndLow(String numbers) {
        // Code here or
        String[] split = numbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String s : split) {
            Integer integer = Integer.valueOf(s);
            min = Integer.min(min, integer);
            max = Integer.max(max, integer);
        }
        return max + " " + min;
    }

    public static int[] monkeyCount(final int n){
        int[] monkeys = new int[n];
        for (int i = 0; i < n; i++) {
            monkeys[i] = i + 1;
        }
        return monkeys;
    }


    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("42 -9".equals(HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4")));

    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int counter = 0;

        for (Boolean sheep : arrayOfSheeps) {
            if(sheep){
                counter++;
            }
        }
        return counter;
    }

}
