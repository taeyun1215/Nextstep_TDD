package afterFeedback;

public class Position {

    private final int position;

    public Position() {
        this.position = 0;
    }

    public Position(int position) {
        this.position = position;
    }


    public Position move() {
        return new Position(position + 1);
    }

    public int getPosition() {
        return position;
    }
}
