package pl.sages.kodolamacz.zadania;

public class Zadanie12 {

    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        int[] y = {5,10,15,20,25};

        double korelacja = korelacja(x,y);
        System.out.println(korelacja);

    }

    public static double korelacja(int[] x, int[] y) {
        double sredniaX = srednia(x);
        double sredniaY = srednia(y);

        double licznik = 0;
        double mianownikX = 0;
        double mianownikY = 0;
        for (int i = 0; i < x.length; i++) {
            double roznicaX = x[i] - sredniaX;
            double roznicaY = y[i] - sredniaY;
            licznik += roznicaX * roznicaY;
            mianownikX += roznicaX * roznicaX;
            mianownikY += roznicaY * roznicaY;
        }

        return licznik / Math.sqrt(mianownikX * mianownikY);
    }

    private static double srednia(int[] tab) {
        double suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma = suma + tab[i];
        }
        return suma / tab.length;
    }

}
