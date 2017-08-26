package pl.sages.kodolamacz.dziedziczenie;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Cat mruczek = new Cat("Mruczek");
        mruczek.voice();
    }

    // nadpisywanie metod z klasy nadrzędnej
    @Override
    public void voice() {
        System.out.println("Miauuu");
    }
}
