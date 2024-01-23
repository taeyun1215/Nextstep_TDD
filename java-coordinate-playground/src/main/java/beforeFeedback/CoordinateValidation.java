package beforeFeedback;

public class CoordinateValidation {
    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = 24;

    public static void validation(int x, int y) {
        if ((x < MIN_COORDINATE || x > MAX_COORDINATE) || (y < MIN_COORDINATE || y > MAX_COORDINATE)) {
            throw new IllegalArgumentException("X, Y좌표는 0부터 24까지만 입력 가능합니다.");
        }
    }
}
