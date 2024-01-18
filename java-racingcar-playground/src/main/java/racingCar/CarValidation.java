package racingCar;

public class CarValidation {

    public static void carNameValidate(String carName) {
        if (carName.length() > 5) {
            throw new RuntimeException("차 이름은 5자를 초과할 수 없습니다.");
        }
    }

    public static void tryNumberValidate(String tryNumber) {
        if (!tryNumber.matches("^[1-9]\\d*$")) {
            throw new RuntimeException("시도 횟수는 0 초과의 정수여야 합니다.");
        }
    }
}
