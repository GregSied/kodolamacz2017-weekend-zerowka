package pl.sages.kodolamacz.dziedziczenie;

public abstract class Pet {

    protected String name;

    // alt + insert == menu do generowania
    // command + n == na macu
    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice(){
        System.out.println("Domyślna implementacja metody daj głos");
    }


}
