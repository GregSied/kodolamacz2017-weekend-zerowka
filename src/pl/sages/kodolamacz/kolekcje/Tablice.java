package pl.sages.kodolamacz.kolekcje;

import java.util.Arrays;
import java.util.Comparator;

public class Tablice {

    public static void staticPrint(){}

    public static void main(String[] args) {

        staticPrint();

        new Tablice().print();
        // to działa, ale nie jest poprawne koncepcyjnie
        // statyczne metody powinny być wołane przez KLASĘ a nie OBIEKT
        new Tablice().staticPrint();
        Tablice.staticPrint();

        int[] liczby = {83, 33, 1, -3, 5};
        System.out.println("Przed sortowaniem");
        System.out.println(Arrays.toString(liczby));
        // Arrays to klasa typu "utils"
        Arrays.sort(liczby);
        System.out.println("Po sortowaniu");
        System.out.println(Arrays.toString(liczby));

        System.out.println(Arrays.binarySearch(liczby, 33));
        System.out.println(Arrays.binarySearch(liczby, 0));
        System.out.println(Arrays.binarySearch(liczby, 6));
        Integer[] modulo = {12,3,91,4,55,1};
        System.out.println(Arrays.toString(modulo));
        Arrays.sort(modulo,new ModuloComparator());
        System.out.println(Arrays.toString(modulo));

        Arrays.sort(modulo,new ReversedComparator());
        System.out.println(Arrays.toString(modulo));

    }

    public void print(){}

}


class ReversedComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return -(o1 - o2);
    }
}

class ModuloComparator implements Comparator<Integer>{


    // 0 - to są równe
    // 1 - to pierwszy jest większy
    // -1 - to drugi jest większy
    // a - b > 0
    // 5 - 2
    @Override
    public int compare(Integer o1, Integer o2) {
        int result = (o1 % 10) - (o2 % 10);
        if (result==0) {
            return o1-o2;
        }
        return result;
    }
}
