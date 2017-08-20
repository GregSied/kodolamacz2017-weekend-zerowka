package pl.sages.kodolamacz.sterowanie;

public class Petle {

//    <modyfikator dostępu> <zwracany typ> <nazwa>(<parametry> ){
//
//    }

    public static void forLoop(){
        //for(warunek początkowy; warunek stopu; kod wykonywany co obrót){ }

        int i;
        for(i = 0; i < 10; i++){
            System.out.println("To jest obrót pętli numer "+i);
        }
        System.out.println("Po wykonaniu pętli i="+i);

        // template fori
        for (int iterator = 0; iterator < 50; iterator++) {

        }
    }

    public static void whileLoop(){
        // pętla while wykonuje się tak długo, jak długo jest
        // prawdziwy warunek w pętli
        // while(warunek) {}
        int age = 0;
        while(age < 18){
            System.out.println("Jesteś niepełnoletni, masz "+ age +" lat");
            // urodziny
            age++;
        }

    }

    public static void whileLoop2(){
        String text = "Ala ma kota, a kot ma psa i chomika.";
        int currentIndex = 0;
        // pierszy znak z tekstu
        char currentChar = text.charAt(currentIndex);
        System.out.println("Pętla while");
        while(currentChar != 'A'){
            System.out.println("Obecny znak '"+currentChar+"'");
            currentIndex++;
            currentChar = text.charAt(currentIndex);
        }
    }

    public static void doWhileLoop(){
        String text = "Ala ma kota, a kot ma psa i chomika.";
        int currentIndex = 0;
        // pierszy znak z tekstu
        char currentChar = text.charAt(currentIndex);
        System.out.println("Pętla do-while");

        do{
            currentChar = text.charAt(currentIndex);
            System.out.println("Obecny znak '"+currentChar+"'");
            currentIndex++;
        }while(currentChar != 'A');
    }

    public static void whileFor(){
        // równoważne
        int k = 10;
        for(int i = 0; i < k; i++){

        }

        int i = 0;
        while(i < k){
            i++;
        }
    }

    public static void breakContinue(){
        int[] tab = {1,2,4,8,11,-5,4};

        // chcę wypisać wszystkie parzyste PRZED pierwszą ujemną
        // jeśli parzysta to wypisz, jeśli ujemna to przerwij pętle

        // break - przerywa
        // continue - przechodzi do następnej iteracji pętli
        for (int i : tab) {
            // jeśli ujemna to przerwij
            if(i < 0){
                System.out.println("Ujemna - PRZERYWAM");
                break;
            }
            // jeśli nieparzysta to pomijam
            if(i % 2 != 0){
                System.out.println("Nieparzysta, przeskakuje dalej");
                continue;
            }
            System.out.println("Parzysta = "+i);
        }
    }

    public static void main(String[] args) {
        forLoop();
        whileLoop();
        whileLoop2();
        doWhileLoop();
        breakContinue();
    }

}
