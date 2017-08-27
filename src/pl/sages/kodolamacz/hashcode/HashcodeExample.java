package pl.sages.kodolamacz.hashcode;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class HashcodeExample {
}


class Person{
    UUID uuid = UUID.randomUUID();
    String email;
    int age;

    public Person(String email, int age) {
        this.email = email;
        this.age = age;
    }

    public static void main(String[] args) {
        Person jasio = new Person("jasio@gmail.com",20);

        Set<Person> set = new HashSet<>();
        set.add(jasio);

        if(set.contains(jasio)){
            System.out.println("jasio jest");
        }
        // jeśli opieramy hashcode o wiek, który się zmienia
        // to zmianie wieku jasio już się w tej kolekcji nie znajdzie
        // chociaż tam jest
        jasio.age++;
        if(set.contains(jasio)){
            System.out.println("jasio jest");
        }else{
            System.out.println("jasia nie ma :(");
        }
        System.out.println(set);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        // dzięki temu, że opieramy identyfikację obiektów
        // o niezmienny klucz to nie "gubimy" obiektów w kolekcji
        return this.uuid.equals(person.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "uuid=" + uuid +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", hashcode=" + hashCode() +
                '}';
    }
}