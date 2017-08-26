package pl.sages.kodolamacz.vending;

public class VendingMachine {

    private Shelf[] shelves;
    private CoinDispenser dispenser;

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
}
