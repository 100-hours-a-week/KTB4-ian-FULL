import java.util.Scanner;

public class InputThread extends Thread {

    private int inputNumber = -1;

    @Override
    public void run() {

        Scanner input = new Scanner(System.in);

        System.out.print("""
                
                =========================
                1. 게임 시작하기
                2. 게임 종료하기
                
                메뉴를 선택해주세요:
                """);

        String inputText = input.nextLine();

        try {
            inputNumber = Integer.parseInt(inputText);

        } catch (NumberFormatException e) {

            inputNumber = -999;
        }
    }

    public int getInputNumber() {
        return inputNumber;
    }
}