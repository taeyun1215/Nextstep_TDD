package afterFeedback;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarParser {

    private static final String DEFAULT_DELIMITER = ",";

    public List<Car> parser(String input) {
        String[] carNames = input.split(DEFAULT_DELIMITER);
        // Car 객체 생성
        return Arrays.stream(carNames)
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
