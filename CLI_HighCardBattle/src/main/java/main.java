import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("""
                    =========================
                    1. 게임 시작하기
                    2. 게임 종료하기
                    
                    메뉴를 선택해주세요: """);
            int menu = input.nextInt();

            if (menu == 1) {
                PlayingCard userCard =  new PlayingCard();

                int userNum = userCard.cardNum();
                int computerNum = userCard.cardNum();

                System.out.println("당신의 카드는 " + userCard.getCardName() + "입니다.");

                System.out.print("""
                    =========================
                    당신의 카드는 " + userCard.getCardName() + "입니다.
                    
                    1. 도전하기
                    2. 포기하기
                    
                    선택해주세요: """);
                int menuGame = input.nextInt();

                if (menuGame == 1) {
                    if (computerNum == userNum) {
                        System.out.println("비겼습니다.");
                    } else if (computerNum > userNum) {
                        System.out.println("졌습니다.\n 당신의 카드는 " + userCard.getCardName());
                    }  else {
                        System.out.println("이겼습니다.");
                    }
                }
            }
            // 게임 종료
            else if (menu == 2) {
                System.out.println("""
                        
                        -------------------------
                        게임을 종료합니다.
                        -------------------------
                        """);
                break;
            }
            // 예외사항
            else {
                System.out.println("""
                        
                        -------------------------
                        메뉴에 없는 번호를 선택했습니다.
                        번호를 다시 선택해주세요.
                        -------------------------
                        """);
            }
        }
    }
}
