import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    void 쉼표를_구분자로_가진_문자열을_입력했을_때_숫자들의_합을_반환하는지_테스트한다() {
        StringCalculator stringCalculator = new StringCalculator();
        String input = "1,2,3";
        int expected = 6;

        int result = stringCalculator.calculator(input);

        assertEquals(expected, result);
    }

}
