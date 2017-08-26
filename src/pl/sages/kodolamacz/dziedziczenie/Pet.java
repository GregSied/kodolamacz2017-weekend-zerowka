package pl.sages.kodolamacz.dziedziczenie;

public abstract class Pet {

    protected String name;

    // alt + insert == menu do generowania
    // command + n == na macu
    public Pet(String name) {
        System.out.println("Tworze zwierzaka");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void voice();

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
