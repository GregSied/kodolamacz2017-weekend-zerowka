package pl.sages.kodolamacz.dziedziczenie;

public class Polimorfizm {

    public static void show(Pet pet){
        System.out.println("To jest zwierzątko o imieniu "+ pet.getName());
        pet.voice();
    }

    public static void show(Dog dog){
        System.out.println("To jest pies o imieniu "+ dog.getName());
    }

    public static void show(Bird bird){
        System.out.println("To jest ptak o imieniu "+bird.getName());
        System.out.println("Zobacz jak ładnie lata ");
        bird.fly();
    }

    public static void main(String[] args) {
        Dog pies = new Dog("Pies");
        pies.aport();

        Cat kot = new Cat("Kot");
        Parrot polly = new Parrot("Polly");

        // mogę odwołać się po nazwie klasy
//        Polimorfizm.show(pies);

        //ale jestem w tej samej klasie, więc możemy to ominąć
        show(kot);
        show(pies);
        show(polly);
        Pet pet = new Parrot("a");
        System.out.println("show(pet);");
        show(pet);
        System.out.println("show((Pet) polly);");
        show((Pet) polly);

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
