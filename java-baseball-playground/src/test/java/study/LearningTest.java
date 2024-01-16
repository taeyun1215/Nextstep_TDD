package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LearningTest {

    @Nested
    @DisplayName("String 클래스에 대한 학습 테스트")
    public class StringTest {
        @Test
        @DisplayName("요구사항 1")
        void test1() {
            String[] actual1 = "1,2".split(",");
            assertThat(actual1).contains("1", "2");

            String[] actual2 = "1".split(",");
            assertThat(actual2).containsExactly("1");
        }

        @Test
        @DisplayName("요구사항 2")
        void test2() {
            String input = "(1,2)";
            String actual = input.substring(1, input.length() - 1);
            assertThat(actual).isEqualTo("1,2");
        }

        @Test
        @DisplayName("요구사항 3")
        void test3() {
            String input = "abc";
            assertThatThrownBy(() -> {
                char ch = input.charAt(3); // 범위를 벗어나는 인덱스
            })
                    .isInstanceOf(StringIndexOutOfBoundsException.class)
                    .hasMessageContaining("String index out of range: 3");
        }
    }

    @Nested
    @DisplayName("Set Collection에 대한 학습 테스트")
    public class SetTest {

        private Set<Integer> numbers;

        @BeforeEach
        void setUp() {
            numbers = new HashSet<>();
            numbers.add(1);
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
        }

        @Test
        @DisplayName("요구사항 1")
        void test2_1() {
            assertThat(numbers.size()).isEqualTo(3);
        }

        @ParameterizedTest
        @ValueSource(ints = {1, 2, 3})
        @DisplayName("요구사항 2")
        void test2_2(int number) {
            assertThat(numbers.contains(number)).isTrue();
        }

        @ParameterizedTest
        @CsvSource({"1, true", "2, true", "3, true", "4, false", "5, false"})
        @DisplayName("요구사항 3")
        void test2_3(int number, boolean expected) {
            assertThat(numbers.contains(number)).isEqualTo(expected);
        }
    }


}
