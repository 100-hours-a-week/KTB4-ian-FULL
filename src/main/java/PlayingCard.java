import java.util.Random;

public class PlayingCard extends Card {
    Random random = new Random();

    private String suit;
    private String rank;

    // 카드 풀네임
    @Override
    public String getCardName() {
        cardName =  getSuit() + " " + getRank();
        return cardName;
    }

    // 문양 랜덤 출력
    public String getSuit() {
        int suitNum = random.nextInt(4);

        // 카드 문양 로직
        if  (suitNum == 0) {
            suit = "하트";
        }  else if (suitNum == 1) {
            suit = "스페이스";
        }   else if (suitNum == 2) {
            suit = "클로버";
        }   else {
            suit = "다이아몬드";
        }

        return suit;
    }

    // 숫자 랜덤 출력
    int rankNum = random.nextInt(12) + 2;

    public int cardNum() {
        int cardNum = rankNum;
        return  cardNum;
    }

    // 뽑힌 숫자 문자열로 변경
    public String getRank() {
        if (2 <= rankNum && rankNum <= 10) {
            rank = Integer.toString(rankNum);
        } else if (rankNum == 11) {
            rank = "J";
        }  else if (rankNum == 12) {
            rank = "Q";
        }   else if (rankNum == 13) {
            rank = "K";
        }    else if (rankNum == 14) {
            rank = "A";
        }

        return rank;
    }
}
