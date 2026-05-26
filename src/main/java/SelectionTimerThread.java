public class SelectionTimerThread extends Thread {

    private boolean timeout;

    public SelectionTimerThread() {
        this.timeout = false;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(9000);

            timeout = true;

            System.out.println("""
                    =========================
                    입력 시간이 초과되었습니다.
                    자동으로 게임을 진행합니다.
                    =========================""");

        } catch (InterruptedException e) {

            System.out.println("""
                    =========================
                    입력이 완료되었습니다.
                    타이머를 종료합니다.
                    =========================""");
        }
    }

    public boolean isTimeout() {
        return timeout;
    }
}