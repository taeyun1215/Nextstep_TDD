package stringCalculator;

import org.junit.jupiter.api.Test;
import stringCalculator.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringValidationTest {

    @Test
    void 빈_문자열을_입력했을_때_0을_반환하는지_테스트() {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("");
        assertEquals(0, result);
    }

    @Test
    void 숫자_이외의_값이_포함된_경우_RuntimeException을_throw하는지_테스트() {
        StringCalculator stringCalculator = new StringCalculator();

        assertThrows(RuntimeException.class, () -> {
            stringCalculator.add("1,a,3");
        });
    }
}
