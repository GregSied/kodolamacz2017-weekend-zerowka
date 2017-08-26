package pl.sages.kodolamacz.dziedziczenie;

public class Polimorfizm {

    public static void main(String[] args) {
        Dog pies = new Dog("Pies");
        pies.aport();

        Cat kot = new Cat("Kot");

        // chociaz to jest pies, to zmienna przechowuje zwierze
        Pet zwierzatko = new Dog("Pongo");
        // więc aport niestety nie jest widoczne tutaj
//        zwierzatko.aport();

        // tu nie jest domyślna implementacja z pet
        // tylko z tego obiektu, który aktualnie tutaj siedzi
        // więc jest hau hau z Dog
        zwierzatko.voice();

        // bezpiecznie sprawdzić czy to zwierze jest psem
        // i jeśli tak to dopiero
        if(zwierzatko instanceof Dog){
            // mowię tutaj wprost, że to zwierzątko jest psem
            // jeśli tak jest to możemy zrobić wszystko co potrafi pies
            ((Dog) zwierzatko).aport();
        }

        zwierzatko = new Cat("Pysio");
        zwierzatko.voice();

        // ClassCastException - kot nie jest psem :(
        //((Dog) zwierzatko).aport();

    }

}
