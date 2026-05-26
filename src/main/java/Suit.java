public enum Suit {

    SPADE("스페이드", 3),
    HEART("하트", 2),
    DIAMOND("다이아몬드", 1),
    CLUB("클로버", 0);

    private final String displayName;
    private final int suitPower;

    Suit(String displayName, int suitPower) {
        this.displayName = displayName;
        this.suitPower = suitPower;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getSuitPower() {
        return suitPower;
    }
}
