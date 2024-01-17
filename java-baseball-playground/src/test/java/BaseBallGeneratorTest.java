import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BaseBallGeneratorTest {

    @Test
    void 생성된_볼_숫자가_1에서9_사이일_때() {
        assertThat(new BaseBallNumber(1).getNumber()).isBetween(1, 9);
        assertThat(new BaseBallNumber(9).getNumber()).isBetween(1, 9);
    }

    @Test
    void 생성된_볼_숫자가_1에서9_사이가_아닐_때() {
        assertThrows(IllegalArgumentException.class, () -> new BaseBallNumber(0));
        assertThrows(IllegalArgumentException.class, () -> new BaseBallNumber(10));
    }

    @Test
    void 생성된_볼_숫자_전체가_3자리일_때() {
        List<BaseBallNumber> computerBaseBallNumbers = BaseBallNumbersGenerator.generate();
        assertThat(computerBaseBallNumbers.size()).isEqualTo(3);
    }
}
