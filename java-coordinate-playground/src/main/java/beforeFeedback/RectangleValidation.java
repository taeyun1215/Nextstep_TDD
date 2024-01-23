package beforeFeedback;

public class RectangleValidation {

    public static void validation(Coordinate topLeft, Coordinate bottomRight) {
        if (topLeft.getX() >= bottomRight.getX() || topLeft.getY() <= bottomRight.getY()) {
            throw new IllegalArgumentException("잘못된 사각형입니다.");
        }
    }
}
