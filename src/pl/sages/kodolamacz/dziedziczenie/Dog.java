package pl.sages.kodolamacz.dziedziczenie;

public class Dog extends Pet {

    public Dog(String name) {
        // super oznacza wywołania konstruktowa z klasy nadrzędnej
        super(name);
    }

    public static void main(String[] args) {
        Dog reks = new Dog("Reks");

        System.out.println("Ten pies nazywa się "+reks.getName());
        reks.voice();
    }

    public void aport(){
        System.out.println("Przynieś patyk, dobry piesek");
    }

    @Override
    public void voice(){
        System.out.println("Hau hau");
    }
}
