package pl.sages.kodolamacz.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list = new ArrayList<>(300);
        list.add(4);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(88);
        System.out.println(list);
        // można zrobić list.add(new Integer(17)) ale kompilator robi to za nas
        // tzw auto-boxing
        list.add(17);
        list.add(38);
        System.out.println(list);
        // podobnie jak w tablicy wybieramy zerowy element
        // tablica[0]
        // można zrobić list
        list.get(0); // to jest 4
        list.get(1); // to jest 1
        list.get(2); // to jest 1
        list.get(4); // to jest 88

        // itli
        for (int i = 0; i < list.size(); i++) {
            // unboxing - odpakowywanie dużego Integer'a na małego int'a
            int integer = list.get(i);
            System.out.println("Na miejscu i="+i+" znajduje się "+integer);
        }

        List<Integer> one = new ArrayList<>();
        one.add(1);
        one.add(2);
        one.add(3);
        // tworzę nową listę, która ma przepisane elementy z listy 'list'
        List<Integer> two = new ArrayList<>(list);
        one.addAll(two); // do list one dodaje wszystko z two

        System.out.println(one);
        System.out.println(two);

        List<Integer> parzyste = new ArrayList<>();
        parzyste.add(0);
        parzyste.add(2);
        parzyste.add(4);
        parzyste.add(6);

        List<Integer> mniejszeNizTrzy = new ArrayList<>();
        mniejszeNizTrzy.add(0);
        mniejszeNizTrzy.add(1);
        mniejszeNizTrzy.add(2);

        parzyste.removeAll(mniejszeNizTrzy);
        System.out.println(parzyste);

        // każda lista ma swój rozmiar
        parzyste.size();



    }

}
