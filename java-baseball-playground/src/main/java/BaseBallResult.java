public class BaseBallResult {
    private int strikes;
    private int balls;

    public BaseBallResult() {
        this.strikes = 0;
        this.balls = 0;
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }

    public void record(BaseBallStatus baseBallStatus) {
        if (baseBallStatus.isStrike()) {
            this.strikes++;
        }
        if (baseBallStatus.isBall()) {
            this.balls++;
        }
    }
}
