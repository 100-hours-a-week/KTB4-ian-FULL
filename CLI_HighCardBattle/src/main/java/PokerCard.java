public class PokerCard extends PlayingCard {
    int point;

    @Override
    public int cardNum() {
        int rankNum = cardNum();
        return rankNum;
    }

    public int getPoint() {
        point = cardNum();
        return point;
    }
}
