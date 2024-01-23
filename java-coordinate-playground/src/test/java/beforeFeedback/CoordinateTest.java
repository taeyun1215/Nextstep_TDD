package beforeFeedback;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinateTest {

    @Test
    void create() {
        Coordinate coordinate = new Coordinate(0,0);
        assertThat(coordinate.isEqualX(0)).isTrue();
        assertThat(coordinate.isEqualY(0)).isTrue();
    }

}
