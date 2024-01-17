public enum BaseBallStatus {
    BALL, STRIKE, OUT;

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }
}
