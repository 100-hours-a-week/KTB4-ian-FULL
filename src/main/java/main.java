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
                // 유저와 컴퓨터 카드 뽑기
                PlayingCard userCard =  new PlayingCard();
                PlayingCard computerCard =  new PlayingCard();

                int userNum = userCard.cardNum();
                int computerNum = computerCard.cardNum();
                String userCardname = userCard.getCardName();
                String computerCardname = computerCard.getCardName();

                // 게임 진행
                System.out.println("당신의 카드는 " + userCardname + "입니다.");

                System.out.print("\n=========================\n"
                    + "당신의 카드는 " + userCardname + "입니다." +
                    """
                    
                    1. 도전하기
                    2. 포기하기
                    
                    *메뉴에 없는 번호 입력 시 포기한 것으로 간주*
                    선택해주세요: """);
                int menuGame = input.nextInt();

                if (menuGame == 1) {
                    if (computerNum == userNum) {
                        System.out.println("\n컴퓨터와 비겼습니다." +
                                "\n당신의 카드는 " + userCardname +
                                "\n컴퓨터의 카드는 " + computerCardname + "\n");
                    } else if (computerNum > userNum) {
                        System.out.println("\n컴퓨터한테 졌습니다." +
                                "\n당신의 카드는 " + userCardname +
                                "\n컴퓨터의 카드는 " + computerCardname + "\n");
                    }  else {
                        System.out.println("\n컴퓨터한테 이겼습니다." +
                                "\n당신의 카드는 " + userCardname +
                                "\n컴퓨터의 카드는 " + computerCardname + "\n");
                    }
                } else {
                    System.out.println("\n당신은 게임을 포기했습니다.");
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
