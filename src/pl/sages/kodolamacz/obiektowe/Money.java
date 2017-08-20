package pl.sages.kodolamacz.obiektowe;

public class Money {

    // wartość w groszach
    private int value;

    public Money(int value) {
        this.value = value;
    }

    // metoda toString która ładnie formatuje do postaci "pieniężnej"
//    @Override
//    public String toString() {
//        int grosze = value % 100;
//        // warunek ? jesli TRUE : jesli FALSE
//        return value/100 + "." + (grosze < 10 ? "0" : "")
//                + grosze + " PLN";
//    }

    public Money add(Money other){
        return new Money(this.value + other.value);
    }

    public String toString() {
        // warunek ? jesli TRUE : jesli FALSE
        String grosze = String.valueOf(value);
        return value/100 + "." + grosze.substring(grosze.length()-2) + " PLN";
    }
}
