package beforeFeedback;

public class Triangle {
    private final Coordinate coordinate1;
    private final Coordinate coordinate2;
    private final Coordinate coordinate3;

    public Triangle(Coordinate coordinate1, Coordinate coordinate2, Coordinate coordinate3) {
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
        this.coordinate3 = coordinate3;
    }

    public double area() {
        double a = distanceBetween(coordinate1, coordinate2);
        double b = distanceBetween(coordinate2, coordinate3);
        double c = distanceBetween(coordinate1, coordinate3);

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private double distanceBetween(Coordinate Coordinate1, Coordinate Coordinate2) {
        return Math.sqrt(Math.pow(Coordinate2.getX() - Coordinate1.getX(), 2) + Math.pow(Coordinate2.getY() - Coordinate1.getY(), 2));
    }
}

