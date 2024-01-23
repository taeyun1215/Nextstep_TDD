package beforeFeedback;

public class Line {
    private final Coordinate start;
    private final Coordinate end;

    public Line(Coordinate start, Coordinate end) {
        this.start = start;
        this.end = end;
    }

    public double length() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) +
                Math.pow(end.getY() - start.getY(), 2));
    }
}

