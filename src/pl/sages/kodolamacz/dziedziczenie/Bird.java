package pl.sages.kodolamacz.dziedziczenie;

public abstract class Bird extends Pet {

    public Bird(String name) {
        super(name);
        System.out.println("Tworze ptaka");
    }

    public void fly(){}

    @Override
    public String toString() {
        return "Bird{} " + super.toString();
    }
}
