package racingCar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarParser {

    private static final String DEFAULT_DELIMITER = ",";

    public List<Car> parser(String input) {
        String[] carNames = input.split(DEFAULT_DELIMITER);
        return Arrays.stream(carNames)
                .map(carName -> {
                    CarValidation.carNameValidate(carName); // 유효성 검사 실행
                    return new Car(carName); // Car 객체 생성
                })
                .collect(Collectors.toList());
    }
}
