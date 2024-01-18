package racingCar;

import java.util.Random;

public class CarPlay {

    private final Cars cars;
    private final Random random;

    private static final int NUMBER = 4;

    public CarPlay(Cars cars) {
        this.cars = cars;
        this.random = new Random();
    }

    public void play(String tryNumber) {
        CarValidation.tryNumberValidate(tryNumber);
        int numberOfTries = Integer.parseInt(tryNumber);

        for (int i = 0; i < numberOfTries; i++) {
            moveCars();
        }
    }

    private void moveCars() {
        for (Car car : cars.getCars()) {
            if (random.nextInt(10) >= NUMBER) {
                car.move();
            }
        }
    }
}