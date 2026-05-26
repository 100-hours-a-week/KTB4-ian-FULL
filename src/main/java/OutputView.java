public class OutputView {

    public void printBattleStart(BattleResult battleResult) {

        System.out.println("\n당신의 카드: "
                + battleResult.getUserCard()
                .getCardName());

        System.out.println("컴퓨터 카드: "
                + battleResult.getComputerCard()
                .getCardName());
    }

    public void printBattleResult(int result) {

        // 유저 승리
        if (result == 1) {

            System.out.println("""
                            =========================
                            당신이 승리했습니다.
                            =========================
                            """);
        }

        // 컴퓨터 승리
        else if (result == -1) {

            System.out.println("""
                            =========================
                            컴퓨터가 승리했습니다.
                            =========================
                            """);
        }

        // 무승부
        else {

            System.out.println("""
                            =========================
                            무승부입니다.
                            =========================
                            """);
        }
    }

    public void printGameEnd() {

        System.out.println("""
                        =========================
                        게임을 종료합니다.
                        =========================
                        """);
    }

    public void printInputException() {

        System.out.println("""
                        =========================
                        잘못된 번호를 입력하셨습니다.
                        메뉴 번호를 다시 입력해주세요.
                        =========================
                        """);
    }

    public void printGameGiveUp() {
        System.out.println("""
                        =========================
                        게임을 포기했습니다.
                        =========================
                        """);
    }

    public void printAutoPlayMessage() {
        System.out.println("""
                    =========================
                    자동으로 게임을 진행합니다.
                    =========================
                    """);
    }
}