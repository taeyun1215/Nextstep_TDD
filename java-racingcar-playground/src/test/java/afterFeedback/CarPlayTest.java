package afterFeedback;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarPlayTest {

    @Test
    void 전진하는_조건은_0_9사이에서_랜덤_값을_구한_후_그_값이_4_이상이면_1칸_이동한다() {
        Car car = new Car("abc");
        car.move(4);

        assertEquals(1, car.position);
    }

    @Test
    void 전진하는_조건은_0_9사이에서_랜덤_값을_구한_후_그_값이_4_미만이면_이동하지_않는다() {
        String input = "abc,abcd,abcde";
        String tryNumber = "1";

        CarParser carParser = new CarParser();
        List<Car> carNames = carParser.parser(input);
        Cars cars = new Cars(carNames);

        Random mockRandom = new Random() {
            @Override
            public int nextInt(int bound) {
                return 3;
            }
        };

        CarPlay carPlay = new CarPlay(cars, mockRandom);
        carPlay.play(tryNumber);

        for (Car car : cars.getCars()) {
            assertEquals(0, car.getPosition());
        }
    }
}
