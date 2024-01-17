import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BaseBallNumbersGenerator {

    public static List<BaseBallNumber> generate() {
        List<BaseBallNumber> baseBallNumbers = new ArrayList<>();

        while (baseBallNumbers.size() < 3) {
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 10);
            BaseBallNumber newBaseBallNumber = new BaseBallNumber(randomNumber);
            if (!baseBallNumbers.contains(newBaseBallNumber)) {
                baseBallNumbers.add(newBaseBallNumber);
            }
        }
        return baseBallNumbers;
    }
}