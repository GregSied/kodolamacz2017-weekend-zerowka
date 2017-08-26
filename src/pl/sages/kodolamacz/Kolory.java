package pl.sages.kodolamacz;

public class Kolory {

    public static final char WHITE_KING = 0x2654;
    public static final char BLACK_KING = 0x265A;

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_GREY_BACKGROUND = "\u001B[47m";
    public static final String RESET = "\u001B[0m";


    public static void main(String[] args) {
        System.out.println(ANSI_GREY_BACKGROUND + WHITE_KING + BLACK_KING);
        System.out.println(ANSI_BLACK_BACKGROUND+ ANSI_RED+"przed reset czerwone");
        System.out.println(RESET + "po reset");
    }

}
