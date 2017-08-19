package pl.sages.kodolamacz.zadania;

public class Zadanie1 {

    public static void main(String[] args) {
        int[] tab = new int[10];
        tab[0] = 12;

        int[] tablica = {12, 43, 77, 0, -34, -1, 2,3, 12};
        // wypisanie całej tablicy
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("na miejscu "+ i
                    + " znajduje sie " + tablica[i]);
        }

        liczDodatnie(tablica);

        double[] rzeczywiste = {2.5, 15.7, 3.1415, 1.6018, 2.73, 1000.0};

        System.out.println("Srednia wynosi " + kwadratyWiekszych5mniejszych2(rzeczywiste));
    }

    public static void liczDodatnie(int[] tablica){
        // liczba elementow dodatnich
        int licznikDodatnich = 0;
        for (int i = 0; i < tablica.length; i++) {
            int obecnyElement = tablica[i];
            if(obecnyElement > 0){
                licznikDodatnich++;
            }
        }
        if(licznikDodatnich > 4){
            System.out.println("Znaleziono " +
                    licznikDodatnich + " liczb dodatnich");
        }else if(licznikDodatnich == 1){
            System.out.println("Znaleziono " +
                    licznikDodatnich + " liczbę dodatnią");
        }else{
            System.out.println("Znaleziono " +
                    licznikDodatnich + " liczby dodatnie");
        }
    }

    public static double kwadratyWiekszych5mniejszych2(double[] rzeczywiste){
        double suma = 0;
        int licznik = 0;
        for (int i = 0; i < rzeczywiste.length; i++) {
            double v = rzeczywiste[i];
            if(v > 5 | v < 2){
                suma += + v * v;
                licznik++;
            }
        }
        return suma / licznik;
    }

}
