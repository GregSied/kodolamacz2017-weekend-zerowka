package pl.sages.kodolamacz.sterowanie;

import java.util.Optional;

public class Warunkowe {

    public static void ifElse(){
        int age = 19;

        // jeżeli zachodzi
        if (age >= 21) {
            //to zrób to
            System.out.println("jesteś pełnoletni wszędzie");
        } else if (age >= 18) {
            System.out.println("jesteś pełnoletni w europie");
        } else { // w przeciwnym wypadku
            // zrób to
            System.out.println("jesteś nieletni");
        }
    }

    public static void ifElse2(){
        int apples = 3;
        if(apples == 0){
            System.out.println("nie masz jabłek");
        }else if(apples == 1){
            System.out.println("masz jedno jabłko");
        }else if(apples == 2){
            System.out.println("masz dwa jabłka");
        }else{
            System.out.println("nie wiem ile masz jabłek");
        }
    }

    public static void switchExample(){
        int apples = 3;
        switch (apples){
            case 0:
                System.out.println("nie masz jabłek");
                break;
            case 1:
                System.out.println("masz jedno jabłko");
                break;
            case 2:
                System.out.println("masz dwa jabłka");
                break;
            default:
                System.out.println("nie wiem ile masz jabłek");
                break;
        }
    }

    public static void main(String[] args) {
        ifElse();
    }

}

