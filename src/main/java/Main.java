public class Main {

    public static void main(String[] args) {

        OutputView outputView = new OutputView();

        while (true) {

            // 메인 메뉴 입력 스레드
            InputThread mainInputThread = new InputThread();

            mainInputThread.start();

            // 입력 대기
            while (mainInputThread.getInputNumber() == -1) {

                try {
                    Thread.sleep(100);

                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }

            int menu = mainInputThread.getInputNumber();

            // 잘못된 입력
            if (menu == -999) {
                outputView.printInputException();

                continue;
            }

            // 게임 시작
            if (menu == 1) {

                BattleResult battleResult = new BattleResult();
                BattleMenuInputThread battleInputThread = new BattleMenuInputThread();
                SelectionTimerThread timerThread = new SelectionTimerThread();

                battleInputThread.start();
                timerThread.start();

                // 배틀 입력 대기
                while (true) {

                    // 입력 완료
                    if (battleInputThread.getInputNumber() != -1) {

                        timerThread.interrupt();

                        int battleMenu = battleInputThread.getInputNumber();

                        // 잘못된 입력
                        if (battleMenu == -999) {

                            outputView.printInputException();

                            break;
                        }

                        // 도전하기
                        if (battleMenu == 1) {

                            battleResult.playBattle();

                            outputView.printBattleStart(battleResult);
                            outputView.printBattleResult(battleResult.getResult());
                        }

                        // 포기하기
                        else if (battleMenu == 2) {

                            outputView.printGameGiveUp();
                        }

                        // 메뉴 외 번호
                        else {

                            outputView.printInputException();
                        }

                        break;
                    }

                    // 시간 초과
                    if (timerThread.isTimeout()) {

                        outputView.printAutoPlayMessage();

                        battleResult.playBattle();

                        outputView.printBattleStart(battleResult);
                        outputView.printBattleResult(battleResult.getResult());

                        break;
                    }

                    try {

                        Thread.sleep(1000);

                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
            }

            // 게임 종료
            else if (menu == 2) {

                outputView.printGameEnd();

                break;
            }

            // 메뉴 외 번호
            else {

                outputView.printInputException();
            }
        }
    }
}