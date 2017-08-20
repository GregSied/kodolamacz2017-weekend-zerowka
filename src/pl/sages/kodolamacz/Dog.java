package pl.sages.kodolamacz;

public class Dog {

    // najpierw pola składowe
    String name;
    int age;

    public Dog(String name){
        this.name = name;
    }

    // później konstruktor, który tworzy obiek
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog azor(int age){
        return new Dog("Azor", age);
    }

    public boolean aport(String thing){
        return true;
    }

    // dalej reszta metod
    public void bark(){
        System.out.println("hau hau, jestem " + name);
    }

}
