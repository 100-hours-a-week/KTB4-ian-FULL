public class BattleResult extends PlayingCard {

    private PlayingCard userCard;
    private PlayingCard computerCard;

    private int result;

    public void playBattle() {

        userCard = new PlayingCard();
        computerCard = new PlayingCard();

        // 문양 비교
        if (userCard.getSuitPower() > computerCard.getSuitPower()) {
            result = 1;
        }
        else if (userCard.getSuitPower() < computerCard.getSuitPower()) {
            result = -1;
        }

        // 숫자 비교
        else if (userCard.getRankPower() > computerCard.getRankPower()) {
            result = 1;
        }
        else if (userCard.getRankPower() < computerCard.getRankPower()) {
            result = -1;
        }

        // 무승부
        else {
            result = 0;
        }
    }

    public PlayingCard getUserCard() {
        return userCard;
    }

    public PlayingCard getComputerCard() {
        return computerCard;
    }

    public int getResult() {
        return result;
    }
}