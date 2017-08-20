package pl.sages.kodolamacz.obiektowe;

import java.util.Arrays;

public class Order {

    private int counter = 0;
    private Article[] articles;
    private ClientType clientType;

    public Order(int size) {
        articles = new Article[size];
    }

    public void add(Article article){
        if(counter < articles.length){
            articles[counter] = article;
            counter++;
        }else{
            System.out.println("Zamówienie jest już pełne! Nie można dodać");
        }
    }

    public Money getTotalCost(){
        Money sum = new Money(0);
        for (Article article : articles) {
            sum = sum.add(article.getPrice());
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "articles=" + Arrays.toString(articles) +
                '}';
    }
}
