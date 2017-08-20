package pl.sages.kodolamacz.zadania;

public class Zadanie5 {

    public static void main(String[] args) {
        String[] tab = {"Ala","Hela","Frania","Zosia"};

        // for
        // template - itar
        for (int i = 0; i < tab.length; i++) {
            String s = tab[i];
            System.out.println(s);
        }

        // while
        int counter = 0;
        while(counter < tab.length){
            System.out.println(tab[counter]);
            counter++;
        }

        // foreach
        for (String s : tab) {
            System.out.println(s);
        }

    }

}
