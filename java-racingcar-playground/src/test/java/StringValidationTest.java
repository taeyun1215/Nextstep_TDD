import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringValidationTest {

    @Test
    void 빈_문자열을_입력했을_때_0을_반환하는지_테스트() {
        StringValidation calculator = new StringValidation();
        int result = calculator.add("");
        assertEquals(0, result);
    }

    @Test
    void 숫자_이외의_값이_포함된_경우_RuntimeException을_throw하는지_테스트() {
        StringValidation calculator = new StringValidation();

        assertThrows(RuntimeException.class, () -> {
            calculator.add("1,a,3");
        });
    }

}
