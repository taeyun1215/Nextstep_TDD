import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class NumberBaseball {

    public List<Integer> generateRandomNumbers() {
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 3) {
            int randomNum = (int) (Math.random() * 9) + 1;
            numbers.add(randomNum);
        }
        return new ArrayList<>(numbers);
    }

    public String calculateResult(List<Integer> computerNumbers, List<Integer> playerNumbers) {
        int strikes = 0;
        int balls = 0;

        for (int i = 0; i < 3; i++) {
            if (playerNumbers.get(i).equals(computerNumbers.get(i))) {
                strikes++;
                continue;
            }
            if (computerNumbers.contains(playerNumbers.get(i))) {
                balls++;
            }

        }
        return formatResult(strikes, balls);
    }

    private String formatResult(int strikes, int balls) {
        if (strikes == 0 && balls == 0) {
            return "0 스크라이크 0 볼";
        }
        if (strikes == 3) {
            return "3스트라이크";
        }

        String result = "";

        if (balls > 0) {
            result += balls + "볼 ";
        }
        if (strikes > 0) {
            result += strikes + "스트라이크";
        }

        return result.trim();
    }
}
