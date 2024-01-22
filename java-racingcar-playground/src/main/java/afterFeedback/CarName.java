package afterFeedback;

public class CarName {

    private final String carName;

    public CarName(String carName) {
        if (carName.length() >= 5) {
            throw new RuntimeException("5 이상이 될 수 없습니다.");
        }
        this.carName = carName;
    }

    public int getSizeCarName() {
        return carName.length();
    }
}
