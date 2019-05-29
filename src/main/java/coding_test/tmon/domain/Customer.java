package coding_test.tmon.domain;

public class Customer {
    private int waitingTime;
    private int eattingTime;
    private boolean givenFood;

    public Customer() {
        this.waitingTime = 0;
        this.eattingTime = 0;
        this.givenFood = false;
    }

    public boolean isOverWait() {
        // 1시간 초과
        if (waitingTime > 3600) {
            return true;
        }
        return false;
    }

    public void waiting() {
        waitingTime++;
    }

    public void eaitting() {
        if (givenFood) {
            eattingTime++;
        }
    }

    public boolean isFinishEat() {
        // 소요시간 11분
        if (eattingTime == 11) {
            return true;
        }
        return false;
    }

    public void givenFood() {
        givenFood = true;
    }
}
