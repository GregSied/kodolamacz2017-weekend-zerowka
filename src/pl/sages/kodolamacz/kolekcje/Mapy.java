package pl.sages.kodolamacz.kolekcje;

import java.util.HashMap;
import java.util.Map;

public class Mapy {

    public static void main(String[] args) {
        Map<String, String> translator = new HashMap<>();

        translator.put("pies", "dog");
        translator.put("kot", "cat");
        translator.put("słońce", "sun");
        translator.put("słońce", "sunny");

        System.out.println(translator.get("pies"));
        System.out.println(translator.get("kot"));
        System.out.println(translator.get("skalpel"));
        System.out.println(translator.get("słońce"));

        if (translator.containsKey("skalpel")) {
            System.out.println("Słownik zawiera słowo skalpel");
        }else{
            System.out.println("Słownik nie zawiera słowa skalpel");

        }
    }

}
