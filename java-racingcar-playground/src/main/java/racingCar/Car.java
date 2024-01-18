package racingCar;

public class Car {

    String carName;
    int position;

    public Car(String carName) {
        this.carName = carName;
        this.position = 0;
    }

    public int size() {
        return carName.length();
    }

    public void move() {
        this.position++;
    }
}
