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

        mapaLicznik();
    }

    private static void mapaLicznik() {
        Map<String, Integer> wordCounter = new HashMap<>();
        String text = "Ala ma kota i psa. Pies ma na imie Reksio. " +
                "Jasio ma psa, małego chomika i szczurka. " +
                "Jasio i jego pies biegają po podwórku.";
        String[] words = text.split("[ .,?;-]+");
        for (String word : words) {
            word = word.toLowerCase();
            // od javy 8 można prościej
            wordCounter.put(word,
                    wordCounter.getOrDefault(word,0)+1);
//
//            if (wordCounter.containsKey(word)) {
//                wordCounter.put(word, wordCounter.get(word) + 1);
//            }else{
//                wordCounter.put(word, 1);
//            }

            // ewentualnie
//            if(!wordCounter.containsKey(word)){
//                wordCounter.put(word, 0);
//            }
//            wordCounter.put(word, wordCounter.get(word) + 1);

        }
        System.out.println(wordCounter);

        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            System.out.println("Klucz="+entry.getKey() +
            " Wartość="+entry.getValue());
            System.out.println(entry.toString());
        }

        wordCounter.entrySet();

    }


}
