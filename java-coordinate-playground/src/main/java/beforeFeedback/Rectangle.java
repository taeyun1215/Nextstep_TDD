package beforeFeedback;

public class Rectangle {
    private final Coordinate topLeft;
    private final Coordinate bottomRight;

    public Rectangle(Coordinate topLeft, Coordinate bottomRight) {
        RectangleValidation.validation(topLeft, bottomRight);
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double area() {
        int width = bottomRight.getX() - topLeft.getX();
        int height = topLeft.getY() - bottomRight.getY();
        return width * height;
    }
}
