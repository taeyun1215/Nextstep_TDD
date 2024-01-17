import java.util.List;

public class BaseBallNumbers {

    private final List<BaseBallNumber> baseBallNumbers;

    public BaseBallNumbers(List<BaseBallNumber> baseBallNumbers) {
        this.baseBallNumbers = baseBallNumbers;
    }

    public int size() {
        return baseBallNumbers.size();
    }

    public BaseBallNumber get(int position) {
        return baseBallNumbers.get(position);
    }

    public boolean isStrike(BaseBallNumber userNumber, int position) {
        return baseBallNumbers.get(position).equals(userNumber);
    }

    public boolean isBall(BaseBallNumber userNumber) {
        return baseBallNumbers.contains(userNumber);
    }

}
