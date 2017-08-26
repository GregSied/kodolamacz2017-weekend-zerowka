package pl.sages.kodolamacz;

public class Przypomnienie {

    public String publiczne = "widoczne dla wszystkich";
    protected String strzezona = "widoczna w pakiecie i klasie dziedziczącej";
    String domyslna = "widoczna w pakiecie";
    private String prywatna = "widoczna tylko w klasie";

    // psvm
    public static void main(String[] args) {
        boolean prawda = true;
        int siedemnascie = 17;
        long dwaMiliony = 2000000;
        //int dwaMilionyInt = dwaMiliony;
        long stoMiliardow = 100_000_000_000L;
        float e = 2.73f;
        double pi = 3.1415;

        // zawsze pojedynczy cudzysłów
        char literkaA = 'A';
        char literkaB = 66; // 66 to kod litery B
        // tablica znaków ASCII
        // sout
        System.out.println(""+literkaA + literkaB + 'C');
        // to nie działa
//        char literkaB = "B";

        // podwójny cudzysłów
        String napis = "Dziś jest piękna pogoda";
        // to też
//        String napis2 = 'Ala ma kota';

        // kontrola przepływu
        if('B' > 'A'){
            System.out.println("B jest większe");
        }

        if(10 < 3){
            System.out.println("10 jest mniejsze od 3");
        }

        // czy 15 jest podzielne przez 3
        if(15 % 3 == 0){
            System.out.println("15 jest podzielne przez 3");
        }else{
            System.out.println("15 nie jest podzielne przez 3");
        }

        int age = 9;
        if(age >= 21){
            System.out.println("jesteś pełnoletni wszędzie");
        }else if(age >= 18){
            System.out.println("jesteś pełnoletni w europie");
        }else{
            System.out.println("nie jesteś pełnoletni");
        }

        // pętle
        // for

        // for(warunek_początkowy; warunek_stopu; instrukcja_co_iteracje)
        for(int i = 0; i < 15; i++){
            System.out.println("Teraz i jest równe "+i);
        }

        int i = 17;
        System.out.println("przed pętlą i="+i);
        for( ; i < 15; i++){
            System.out.println("to się nie powinno wykonać");
        }
        System.out.println("po pętli i="+i);

        String[] napisy = {"Ala","ma","kota","i","chomika"};

        for (int j = 0; j < napisy.length; j++) {
            String tekst = napisy[j];
            System.out.print(tekst + " ");
        }
        // zmienna j żyje tak długo jak pętla
        // j = 15;

        // foreach
        System.out.println();

        for(String tekst : napisy){
            System.out.print(tekst + " ");
        }

        // while
        // while(warunek){ kod_wykonywany_dopki_warunek_prawdziwy}
        age = 5;
        while (age < 18){
            System.out.println("Nie możesz kupić piwa");
            age++; //zwiekszamy o jeden
        }
        System.out.println("Teraz masz "+age+" lat");

        int[] liczby = {127, 33, 84, 1, 85, 27, 44};

        i = 0;
        while(i < liczby.length && liczby[i] % 5 != 0){
            System.out.println("Liczba "+liczby[i] +
                    " nie jest podzielna przez 5");
            i++;
        }
        if(i < liczby.length){
            System.out.println("Liczba "+liczby[i]+" jest podzielna przez 5");
        }else{
            System.out.println("Nie znaleziono :(");
        }

        // do-while
        // najpierw robi, później pyta
        // ZAWSZE wykona się przynajmniej raz
        do{

        }while(i < liczby.length);


        // tablice
        int[] wartosci = {1,2,3,4,5};
        int[] recznie = new int[3];
        // tablice indeksowane od 0 !
        recznie[0] = 17; // pierwszy
        recznie[1] = 13; // drugi
        recznie[2] = 88; // trzeci
        // recznie[3] - tego elementu NIE BĘDZIE! chociaż tablica ma rozmiar 3

        int[][] macierz = {{1,2,3},
                {4,5,6},
                {7,8,9}};

        int[][] nierowne = {{1,2,3,4,5,6},
                {1},
                {},
                {100,100,100}};
    }

    public void publiczna(){
        System.out.println("jestem widoczna dla wszystkich");
    }

    protected void strzezona(){
        System.out.println("jestem widoczna w swoim pakiecie "+
        "pl.sages.kodolamacz oraz dla wszystkich klas, które dziedziczą "+
        "po tej klasie");
    }

    void domyslny(){
        System.out.println("jestem widoczna w swoim pakiecie");
    }

    private void prywatna(){
        System.out.println("jestem widoczna tylko w tej klasie");
    }


}
