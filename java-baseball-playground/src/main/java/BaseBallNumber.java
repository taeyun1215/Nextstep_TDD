import java.util.Objects;

public class BaseBallNumber {

    private static final int MIN = 1;
    private static final int MAX = 9;
    private final int ballnumber;


    public BaseBallNumber(int ballnumber) {
        if (ballnumber < MIN || ballnumber > MAX) {
            throw new IllegalArgumentException("Ball number must be between " + MIN + " and " + MAX);
        }
        this.ballnumber = ballnumber;
    }

    public int getNumber() {
        return ballnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseBallNumber that = (BaseBallNumber) o;
        return ballnumber == that.ballnumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballnumber);
    }
}
