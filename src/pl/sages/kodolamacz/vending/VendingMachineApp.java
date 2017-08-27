package pl.sages.kodolamacz.vending;

import java.util.Scanner;

public class VendingMachineApp {

    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = createVendingMachine();

        while(true){
            System.out.println("Wrzuć monetę [5,2,1,0.5,0.2,0.1] " +
                    "lub wpisz 'cancel' aby anulować " +
                    "lub 'quit' aby skończyć program");
            String s = scanner.nextLine();
            System.out.println(vendingMachine.getDisplay());
            switch (s){
                case "5":
                    vendingMachine.insertCoin(Coin.FIVE_ZLOTY);
                    break;
                case "2":
                    vendingMachine.insertCoin(Coin.TWO_ZLOTY);
                    break;
                case "1":
                    vendingMachine.insertCoin(Coin.ONE_ZLOTY);
                    break;
                case "0.5":
                    vendingMachine.insertCoin(Coin.FIFTY_GROSZY);
                    break;
                case "0.2":
                    vendingMachine.insertCoin(Coin.TWENTY_GROSZY);
                    break;
                case "0.1":
                    vendingMachine.insertCoin(Coin.TEN_GROSZY);
                    break;
                case "cancel":
                    vendingMachine.cancel();
                    break;
                case "quit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("zła komenda, spróbuj jeszcze raz");
            }
        }


    }

    private static VendingMachine createVendingMachine() {
        VendingMachine vendingMachine = new VendingMachine(10);
        Product baton = new Product("Baton Jowisz", new Money(100));
        Product kola = new Product("Kola Koka w puszce", new Money(149));
        vendingMachine.addProductToShelf(baton, 1, 10);
        vendingMachine.addProductToShelf(baton, 2, 10);
        vendingMachine.addProductToShelf(kola, 3, 5);
        return vendingMachine;
    }

}
