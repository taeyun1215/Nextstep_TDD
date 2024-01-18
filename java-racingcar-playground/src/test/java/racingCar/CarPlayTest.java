package racingCar;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarPlayTest {

    @Test
    void 전진하는_조건은_0_9사이에서_랜덤_값을_구한_후_그_값이_4_이상이면_1칸_이동한다() {
        String input = "abc,abcd,abcde";
        String tryNumber = "1";

        CarParser carParser = new CarParser();
        List<Car> carNames = carParser.parser(input);
        Cars cars = new Cars(carNames);

        CarPlay carPlay = new CarPlay(cars);
        carPlay.play(tryNumber);

        assertThat(cars).isEqualTo(3);
    }
}
