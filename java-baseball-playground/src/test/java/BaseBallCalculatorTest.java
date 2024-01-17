import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseBallCalculatorTest {

    private BaseBallNumbers computerBaseBallNumbers;

    @BeforeEach
    void setup() {
        computerBaseBallNumbers = new BaseBallNumbers(
                Arrays.asList(
                        new BaseBallNumber(1),
                        new BaseBallNumber(2),
                        new BaseBallNumber(3)
                )
        );
    }

    @Test
    void 같은_수가_전혀_없다면_아웃() {
        BaseBallNumbers userBaseBallNumbers = new BaseBallNumbers(
                Arrays.asList(
                        new BaseBallNumber(4),
                        new BaseBallNumber(5),
                        new BaseBallNumber(6)
                )
        );

        BaseBallCalculator baseBallCalculator = new BaseBallCalculator();
        BaseBallResult baseBallResult = baseBallCalculator.play(computerBaseBallNumbers, userBaseBallNumbers);
        assertThat(baseBallResult.getStrikes()).isEqualTo(0);
        assertThat(baseBallResult.getBalls()).isEqualTo(0);
    }

    @Test
    void 같은_수가_다른_자리에_있다면_볼() {
        BaseBallNumbers userBaseBallNumbers = new BaseBallNumbers(
                Arrays.asList(
                        new BaseBallNumber(4),
                        new BaseBallNumber(1),
                        new BaseBallNumber(6)
                )
        );

        BaseBallCalculator baseBallCalculator = new BaseBallCalculator();
        BaseBallResult baseBallResult = baseBallCalculator.play(computerBaseBallNumbers, userBaseBallNumbers);
        assertThat(baseBallResult.getStrikes()).isEqualTo(0);
        assertThat(baseBallResult.getBalls()).isEqualTo(1);
    }

    @Test
    void 같은_수가_같은_자리에_있다면_스트라이크() {
        BaseBallNumbers userBaseBallNumbers = new BaseBallNumbers(
                Arrays.asList(
                        new BaseBallNumber(1),
                        new BaseBallNumber(4),
                        new BaseBallNumber(6)
                )
        );

        BaseBallCalculator baseBallCalculator = new BaseBallCalculator();
        BaseBallResult baseBallResult = baseBallCalculator.play(computerBaseBallNumbers, userBaseBallNumbers);
        assertThat(baseBallResult.getStrikes()).isEqualTo(1);
        assertThat(baseBallResult.getBalls()).isEqualTo(0);
    }
}
