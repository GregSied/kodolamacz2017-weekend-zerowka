package pl.sages.kodolamacz;

import java.util.*;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj drugą");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj operację + - * /");
        String operation = scanner.nextLine();
        System.out.print(a + " " + operation + " " + b + " = ");
        switch(operation){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Nieznana operacja");
                break;
        }
    }

}
