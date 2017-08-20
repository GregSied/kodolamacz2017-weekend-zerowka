package pl.sages.kodolamacz;

import java.util.Scanner;

public class WejscieWyjscie {

    public static void main(String[] args) {
        // wyjscie

        System.out.println("Wypisujemy coś użytkownikowi");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podałeś liczbę "+x);

        System.out.println("Przedstaw się");
        String name = scanner.nextLine();
        System.out.println("Witaj "+name+", miło Cię poznać!");

        // + - / *
        String operation = scanner.next();
        switch (operation){
            case "+":
//                System.out.println(a+b);
        }

    }

}
