package pl.sages.kodolamacz.obiektowe;

public enum ClientType {

    REGULAR(0),
    VIP(10),
    SUPERVIP(25);

    private int discount;

    ClientType(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
