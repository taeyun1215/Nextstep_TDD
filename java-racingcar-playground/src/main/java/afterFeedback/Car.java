package afterFeedback;

public class Car {

    String carName;
    int position;

    private static final int FORWARD_NUM = 4;

    public Car(String carName) {
        this.carName = carName;
        this.position = 0;
    }

    public int size() {
        return carName.length();
    }

    public void move(int randomNo) {
        if (randomNo >= FORWARD_NUM) {
            this.position++;
        }
    }

    public int getPosition() {
        return this.position;
    }
}
