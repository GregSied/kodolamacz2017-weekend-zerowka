package pl.sages.kodolamacz.zadania;

public class Zadanie14 {

    public static void main(String[] args) {
        int k = 10000;
        double suma = 0;
        // wersja 1
        double mnoznik = 1.0;
        for (int n = 0; n < k; n++) {
            suma = suma + mnoznik / (2 * n + 1);
            mnoznik = -mnoznik;
        }
        System.out.println(4*suma);

        // wersja 2
        suma = 0;
        for (int n = 0; n < k; n++) {
            if(n % 2 == 0){
                suma = suma + mnoznik / (2 * n + 1);
            }else{
                suma = suma - mnoznik / (2 * n + 1);
            }
        }
        System.out.println(4*suma);

        // wersja 3
        suma = 0;
        mnoznik = 1;
        for (int n = 1; n < 2*k; n+=2) {
            suma = suma + mnoznik / (n);
            mnoznik = -mnoznik;
        }
        System.out.println(4*suma);
        System.out.println(Math.PI);
    }

}
