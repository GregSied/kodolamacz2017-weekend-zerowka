package pl.sages.kodolamacz.vending;

public enum Coin {

    FIVE_ZLOTY(500),
    TWO_ZLOTY(200),
    ONE_ZLOTY(100),
    FIFTY_GROSZY(50),
    TWENTY_GROSZY(20),
    TEN_GROSZY(10);

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
