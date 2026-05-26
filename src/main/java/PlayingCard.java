import java.util.Random;

public class PlayingCard extends Card {

    private static final Random random = new Random();

    private final Suit suit;
    private final Rank rank;

    public PlayingCard() {

        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();

        this.suit = suits[random.nextInt(suits.length)];
        this.rank = ranks[random.nextInt(ranks.length)];
    }

    public String getCardName() {
        return suit.getDisplayName()
                + " "
                + rank.getDisplayName();
    }

    public int getSuitPower() {
        return suit.getSuitPower();
    }

    public int getRankPower() {
        return rank.getRankPower();
    }
}