package pl.sages.kodolamacz.kolekcje;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zbior {

    // zbior nie pozwala na duplikaty
    // zbior nie ma kolejnosci
    public static void main(String[] args) {
        Set<String> zbior = new HashSet<>();

        zbior.add("ala");
        zbior.add("ala");
        zbior.add("ala");
        zbior.add("ala");
        zbior.add("ma");
        zbior.add("kota");
        zbior.add("psa");
        System.out.println(zbior);
        // do zbioru mogę dodać liste (która tutaj jest pusta)
        ArrayList<String> c = new ArrayList<>();
        c.add("raz");
        c.add("raz");
        c.add("raz");
        c.add("dwa");
        HashSet<String> napisy = new HashSet<>();
        napisy.addAll(c);
        System.out.println("c"+c);
        System.out.println("napisy"+napisy);
        List<String> lista = new ArrayList<>();
        lista.add("chomik");
        // na liste dodaję zbiór
        lista.addAll(zbior);
        System.out.println(lista);

        Set<String> a = new HashSet<>();
        a.add("a");
        a.add("b");
        a.add("c");
        Set<String> b = new HashSet<>();
        b.add("b");
        b.add("c");
        b.add("d");
        // suma zbiorow
        Set<String> suma = new HashSet<>(a);
        suma.addAll(b);
        System.out.println("Suma = "+suma);

        // roznica zbiorow a\b
        Set<String> roznica = new HashSet<>(a);
        roznica.removeAll(b);
        System.out.println("Roznica = "+roznica);

        // część wspólna (przecięcie) zbiorów a i b
        Set<String> przeciecie = new HashSet<>(a);
        przeciecie.retainAll(b);
        System.out.println("Przeciecie = "+przeciecie);
    }

}
