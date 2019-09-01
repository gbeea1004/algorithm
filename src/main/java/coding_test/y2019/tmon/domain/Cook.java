package coding_test.y2019.tmon.domain;

public class Cook {
    private boolean working;
    private int workingTime;

    public Cook() {
        this.working = false;
        this.workingTime = 0;
    }

    public boolean isWorking() {
        return working;
    }

    public void work() {
        working = true;
        workingTime++;
    }

    public void rest() {
        working = false;
    }

    public boolean makeFood() {
        // 요리시간 3분
        if (workingTime == 3) {
            workingTime = 0;
            working = false;
            return true;
        }
        return false;
    }
}
