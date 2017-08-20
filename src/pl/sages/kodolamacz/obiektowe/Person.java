package pl.sages.kodolamacz.obiektowe;

import java.time.LocalDate;
import java.util.Date;

public class Person {

    private String name;
    private int age;
//    private LocalDate dateOfBirth;

    public Person(String name, int age) {
        this.name = name;
        if(age < 0){
            age = 0;
        }
        // this z lewej strony jest potrzebny, aby rozwiązać
        // niejednoznaczność nazw pól w klasie i zmiennych
        // obie nazywają się age
        this.age = age;
    }

    public static void main(String[] args) {
        Person ala = new Person("Ala", 21);
        ala.isAdult();
        ala.getName();

        System.out.println(ala);

        // widać ją bo jest dostęp domyślny,
        // jest statyczna, więc nie muszę tworzyć artykułu
        // zmienna jest przypisana do klasy
        System.out.println(Article.counter);
    }

    public void celebrateBirthday(){
        System.out.println("Sto lat!");
        age++;
    }

    public boolean isAdult(){
        // this nie jest tutaj wymagany
        return this.age >= 18;
//        return LocalDate.now().getYear() - dateOfBirth.getYear() >= 18;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
