package beforeFeedback;

public class Coordinate {

    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        CoordinateValidation.validation(x, y);
        this.x = x;
        this.y = y;
    }

    public boolean isEqualX(int otherX) {
        return this.x == otherX;
    }

    public boolean isEqualY(int otherY) {
        return this.y == otherY;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
