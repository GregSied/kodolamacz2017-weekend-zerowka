package pl.sages.kodolamacz.vending;

import java.util.List;

public class VendingMachine {

    private Shelf[] shelves;
    private CoinDispenser dispenser = new CoinDispenser();
    private String display = "";
    private int selectShelf;

    public VendingMachine(int shelfCounter) {
        this.shelves = new Shelf[shelfCounter];
    }

    // trochę zbyt niskopoziomowe
//    public void add(String productName, int value,
//                    int shelf, int productCount){
//        shelves[shelf] = new Shelf(new Product(productName, new Money(value)), productCount);
//
//    }

    public void addProductToShelf(Product product, int shelf,
                                  int productCount){
        shelves[shelf] = new Shelf(product, productCount);
    }


    public void setShelf(int shelfNumber, Shelf shelf){
        shelves[shelfNumber] = shelf;
    }

    // stan wyświetlacza
    public String getDisplay(){
        return display;
    }

    // wciskamy numer półki ('i' to numer półki)
    public void select(int i){
        // tworzymy pole w klasie, które pozwala przechować
        // wybraną półkę
        this.selectShelf = i;
    }

    // klient chce anulować swoje zamówienie
    // wtedy trzeba mu oddać pieniądze
    public void cancel(){

    }

    // co się ma dziać kiedy zostanie wrzucona moneta
    // 1. moneta trafia do coin dispenser
    // 2. czy wrzucona kwota wystarcza na wybrany produkt
    //  2 a. jeśli wystarcza i można wydać resztę to wydaj produkt i resztę
    //  2 b. jeśli nie to zakutalizuj stan wyświetlacza
    //          wpisując pozostałą kwotę do uzpełnienia
    //
    public void insertCoin(Coin coin){
        // 1.
        dispenser.insert(coin);
        // 2.
        Money desiredProductPrice = shelves[selectShelf]
                .getProduct().getPrice();
        // jest odpowienia suma
        if(dispenser.currentSum()
                .greaterThanOrEqualTo(desiredProductPrice)){
            if(dispenser.canGiveChange(desiredProductPrice)){
                // może wydać resztę
                giveProduct();
            }else{
                // za mało pieniędzy na wydanie reszty
                cancel();
            }
        }else{
            // jeszcze za mało
            display = "Pozostało " + desiredProductPrice.minus(dispenser.currentSum());

        }
    }

    private void giveProduct() {
        Product product = shelves[selectShelf].getProduct();
        shelves[selectShelf].takeProduct();
        List<Coin> change = dispenser.giveChange(product.getPrice());
        display = "Wydajemy produkt " + product +
                " oraz wydajemy resztę " +change;


    }
}
