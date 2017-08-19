package pl.sages.kodolamacz;

public class Dog {

    // najpierw pola składowe
    String name;
    int age;

    // później konstruktor, który tworzy obiek
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    // dalej reszta metod
    public void bark(){
        System.out.println("hau hau, jestem " + name);
    }

}
