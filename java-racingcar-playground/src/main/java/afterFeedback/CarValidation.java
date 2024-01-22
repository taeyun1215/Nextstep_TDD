package afterFeedback;

public class CarValidation {

    public static void tryNumberValidate(String tryNumber) {
        if (!tryNumber.matches("^[1-9]\\d*$")) {
            throw new RuntimeException("시도 횟수는 0 초과의 정수여야 합니다.");
        }
    }
}
