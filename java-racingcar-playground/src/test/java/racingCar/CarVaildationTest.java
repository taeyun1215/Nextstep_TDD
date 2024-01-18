package racingCar;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CarVaildationTest {

    @Test
    void 자동차_이름은_5자를_초과할_수_없다() {
        String input = "abcde";

        CarParser carParser = new CarParser();
        List<Car> carNames = carParser.parser(input);

        assertThat(carNames.get(0).size()).isEqualTo(5);
    }

    @Test
    void 자동차_이름은_쉼표를_기준으로_구분한다() {
        String input = "abc,abcd,abcde";

        CarParser carParser = new CarParser();
        List<Car> carNames = carParser.parser(input);

        Cars cars = new Cars(carNames);
        assertThat(cars.size()).isEqualTo(3);
    }

    @Test
    void 시도할_회수는_오로지_숫자여야한다() {
        String tryNumber = "4";
        assertDoesNotThrow(() -> CarValidation.tryNumberValidate(tryNumber));
    }
}
