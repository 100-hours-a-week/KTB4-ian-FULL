import java.util.Scanner;

public class BattleMenuInputThread extends Thread {

    private int inputNumber = -1;

    @Override
    public void run() {

        Scanner input = new Scanner(System.in);

        System.out.print("""
                
                =========================
                1. 도전하기
                2. 포기하기
                
                선택해주세요:
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