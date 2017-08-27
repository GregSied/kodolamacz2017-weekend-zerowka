package pl.sages.kodolamacz.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Generyki {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Ala ma kota");
        list.add(16);
        list.add(true);

        Object o = list.get(1);

        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3); // tutaj dodaje Object

        // zwracany jest Object i muszę go ręcznie rzutować
        Integer o1 = (Integer) numbers.get(2);

        List<String> napisy = new ArrayList<>();
        napisy.add("ab"); // tutaj mogę dodać już tylko String

        // wiemy, że skoro mogę dodawać TYLKO String
        // to zwracana wartość też musi być String
        String s = napisy.get(0);
    }

}


