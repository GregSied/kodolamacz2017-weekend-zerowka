package pl.sages.kodolamacz.vending;

import java.util.*;

public class CoinDispenser {

    // monety do wydawania reszty
    private List<Coin> coins = new ArrayList<>();

    // monety wrzucone przez kupującego zanim zakupił towar
    // więc jeśli anuluje zakup to chcemu mu te monety zwrócić
    private List<Coin> buffer = new ArrayList<>();
    private Money bufferCurrentSum = Money.zero();

    public CoinDispenser() {
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
//        Money sum = Money.zero();
//        for (Coin coin : buffer) {
//            sum = sum.add(coin);
//        }
//        return sum;
    }

    // zaślepka - zakładamy, że trzeba wrzucić dokładną ilość
    // później można zmienić na właściwą, która potrafi wydać resztę
    public boolean canGiveChange(Money money){
        List<Coin> allCoins = new ArrayList<>();
        allCoins.addAll(coins);
        allCoins.addAll(buffer);

        Collections.sort(allCoins);

        Money remainingMoney = currentSum().minus(money);

        // równoważna pętla do pętli foreach
//        for(int i = 0; i < allCoins.size(); i++){
//            Coin coin = allCoins.get(i);
//
//        }
        for (Coin coin : allCoins) {
            if(remainingMoney.greaterThanOrEqualTo(coin)){
                remainingMoney = remainingMoney.minus(coin);
                if(remainingMoney.equals(Money.zero())){
                    return true;
                }
            }
        }
        return false;
    }

    public List<Coin> giveChange(Money money){

        if(!canGiveChange(money)){
            throw new UnsupportedOperationException();
        }

        List<Coin> allCoins = new ArrayList<>();
        allCoins.addAll(coins);
        allCoins.addAll(buffer);

        Collections.sort(allCoins);

        Money remainingMoney = currentSum().minus(money);

        List<Coin> coinsToReturn = new ArrayList<>();

        for (Coin coin : allCoins) {
            if(remainingMoney.greaterThanOrEqualTo(coin)){
                remainingMoney = remainingMoney.minus(coin);
                coinsToReturn.add(coin);
                if(remainingMoney.equals(Money.zero())){
                    allCoins.removeAll(coinsToReturn);
                    buffer.clear();
                    bufferCurrentSum = Money.zero();
                    coins = allCoins;
                    return coinsToReturn;
                }
            }
        }
        // to nie powinno się nigdy zdarzyć
        return Collections.emptyList();
    }

    public List<Coin> returnInsertedMoney(){
        List<Coin> result = buffer;
        buffer = new ArrayList<>();
        bufferCurrentSum = Money.zero();
        return result;
    }

}
