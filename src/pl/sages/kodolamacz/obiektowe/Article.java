package pl.sages.kodolamacz.obiektowe;

public class Article {

    static final int MAX_COUNTER = 100;

    static int counter = 0;

    private int id;
    private final String name;
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
        if(counter > MAX_COUNTER){
            System.out.println("ZA DUŻO PRODUKTÓW!");
        }
        counter++;
        this.id = counter;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Money getPrice() {
        return price;
    }

    // ten setter nie działa, bo nazwa jest finalna
    //  nie możemy jej zmienić
//    public void setName(String name) {
//        printChange("nazwa");
//        this.name = name;
//    }

    public void setDescription(String description) {
        printChange("opis");
        this.description = description;
    }

    public void setPrice(Money price) {
        printChange("cena");
        this.price = price;
    }

    private void printChange(String field){
        System.out.println("Zmieniono wartość pola "+field);
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
        baton.setDescription("Pyszny baton");

        System.out.println(mleko);
        System.out.println(maka);
        System.out.println(jajka);
        System.out.println(baton);
        System.out.println(Article.counter);

        Order order = new Order(3);
        addArticlesAndPrint(mleko, maka, jajka, baton, order);

        Order order2 = new Order(3, ClientType.SUPERVIP);
        addArticlesAndPrint(mleko, maka, jajka, baton, order2);

    }

    private static void addArticlesAndPrint(Article mleko, Article maka, Article jajka, Article baton, Order order) {
        order.add(mleko);
        order.add(maka);
        order.add(jajka);
        order.add(baton);
        System.out.println(order.toString());
        System.out.println("Łączna wartość zamówienia wynosi "+order.getTotalCost());
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
