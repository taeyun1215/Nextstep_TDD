package afterFeedback;

import java.util.Random;

public class CarPlay {

    private final Cars cars;
    private final Random random;

    private static final int DICE_MAX = 10;

    public CarPlay(Cars cars, Random random) {
        this.cars = cars;
        this.random = random;
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
            car.move(random.nextInt(DICE_MAX));
        }
    }
}