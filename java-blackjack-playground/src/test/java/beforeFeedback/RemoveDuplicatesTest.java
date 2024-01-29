package beforeFeedback;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesTest {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    int total = 0;

    @Test
    public void test1() {
        for (int number : numbers) {
            total += number;
        }

        numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    @Test
    public void test2() {
        for (int number : numbers) {
            if (number % 2 == 0) {
                total += number;
            }
        }

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
