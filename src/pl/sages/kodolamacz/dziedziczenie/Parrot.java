package pl.sages.kodolamacz.dziedziczenie;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
        System.out.println("Tworze papuge");
    }

    @Override
    public void fly() {
        System.out.println("fru fru");
    }

    @Override
    public void voice() {
        System.out.println(getName()+" chce krakersa");
    }

    @Override
    public String toString() {
        return "Parrot{} " + super.toString();
    }
}
