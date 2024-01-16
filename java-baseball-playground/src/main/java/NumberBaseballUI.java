import java.util.*;
import java.util.stream.Collectors;

public class NumberBaseballUI {

    private final Scanner scanner = new Scanner(System.in);
    private final NumberBaseball numberBaseball = new NumberBaseball();

    public void startGame() {
        boolean continuePlaying = true;

        while (continuePlaying) {
            List<Integer> computerNumbers = numberBaseball.generateRandomNumbers();
            boolean gameWon = false;

            while (!gameWon) {
                List<Integer> playerNumbers = getPlayerInput();
                String result = numberBaseball.calculateResult(computerNumbers, playerNumbers);
                System.out.println(result);
                gameWon = result.equals("3스트라이크");
            }

            System.out.println("게임 종료");
            continuePlaying = promptForNewGame();
        }
    }

    private List<Integer> getPlayerInput() {
        System.out.println("숫자를 입력해 주세요 : ");
        String input = scanner.nextLine();
        return convertInputToList(input);
    }

    private List<Integer> convertInputToList(String input) {
        return input.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .boxed()
                .collect(Collectors.toList());
    }

    private boolean promptForNewGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = scanner.nextLine();
        return input.equals("1");
    }
}