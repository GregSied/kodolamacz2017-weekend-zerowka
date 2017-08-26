package pl.sages.kodolamacz.vending;

import java.util.*;

public class CoinDispenser {

    // monety do wydawania reszty
    private Map<Coin, Integer> coinCounter =
            new EnumMap<>(Coin.class);

    // monety wrzucone przez kupującego zanim zakupił towar
    // więc jeśli anuluje zakup to chcemu mu te monety zwrócić
    private List<Coin> buffer = new ArrayList<>();
    private Money bufferCurrentSum = new Money(0);

    public CoinDispenser() {
        for (Coin coin : Coin.values()) {
            coinCounter.put(coin, 0);
        }
    }

    public static void main(String[] args) {
        CoinDispenser coinDispenser = new CoinDispenser();

    }

    public void insert(Coin coin){
        buffer.add(coin);
        bufferCurrentSum = bufferCurrentSum.add(coin);
    }

    public Money currentSum(){
        return bufferCurrentSum;
        // jeśli nie trzymamy na dodatkowej zmiennej to
        // wtedy musimy w pętli policzyć ręcznie
//        Money sum = new Money(0);
//        for (Coin coin : buffer) {
//            sum = sum.add(coin);
//        }
//        return sum;
    }

    // zaślepka - zakładamy, że trzeba wrzucić dokładną ilość
    // później można zmienić na właściwą, która potrafi wydać resztę
    public boolean canGiveChange(Money money){
        return bufferCurrentSum.equals(money);
    }

    public List<Coin> giveChange(Money money){
        return Collections.emptyList();
    }

    public List<Coin> returnInsertedMoney(){
        List<Coin> result = buffer;
        buffer = new ArrayList<>();
        bufferCurrentSum = new Money(0);
        return result;
    }

}
