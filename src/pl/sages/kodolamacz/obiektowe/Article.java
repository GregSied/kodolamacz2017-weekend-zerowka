package pl.sages.kodolamacz.obiektowe;

public class Article {

    static int counter = 0;

    private int id;
    private String name;
    private String description;
    private Money price;

    public Article(String name, int price) {
        this(name, "Brak opisu", price);
    }

    // alt + insert == generate -> Constructor
    public Article(String name, String description, int price) {
        this(name, description, new Money(price));
    }

    public Article(String name, String description, Money price) {
        counter++;
        this.id = counter;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // psvm
    public static void main(String[] args) {

        Article mleko = new Article("Mleko",
                "Mleko sojowe", 250);

        Article maka = new Article("Mąka",
                "Mąka pszenna 1kg", 199);

        Article jajka = new Article("Jajka", 349);
        Article baton = new Article("Jowisz", 105);
        Article jowisz = baton;

        System.out.println(mleko);
        System.out.println(maka);
        System.out.println(jajka);
        System.out.println(baton);
        System.out.println(Article.counter);

    }

    // alt + insert == generate -> toString
    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
