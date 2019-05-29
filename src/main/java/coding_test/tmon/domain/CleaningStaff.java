package coding_test.tmon.domain;

public class CleaningStaff {
    private int workingTime;

    public CleaningStaff() {
        this.workingTime = 0;
    }

    public void work() {
        workingTime++;
    }

    public boolean isFinish() {
        // 청소시간 3분
        if (workingTime == 3) {
            workingTime = 0;
            return true;
        }
        return false;
    }
}
