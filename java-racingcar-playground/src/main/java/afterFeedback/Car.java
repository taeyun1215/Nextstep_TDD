package afterFeedback;

public class Car {

    CarName carName;
    Position position;

    private static final int FORWARD_NUM = 4;

    public Car(String carName) {
        this.carName = new CarName(carName);
        this.position = new Position();
    }

    public int size() {
        return carName.getSizeCarName();
    }

    public void move(int randomNo) {
        if (randomNo >= FORWARD_NUM) {
            position.move();
        }
    }

    public int getPosition() {
        return this.position.getPosition();
    }
}
