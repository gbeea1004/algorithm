package programmers.q42746;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testCase1() {
        // given
        int[] numbers = {6, 10, 2};

        // when
        String result = solution.solution(numbers);

        // then
        assertThat(result).isEqualTo("6210");
    }

    @Test
    void testCase2() {
        // given
        int[] numbers = {3, 30, 34, 5, 9};

        // when
        String result = solution.solution(numbers);

        // then
        assertThat(result).isEqualTo("9534330");
    }
}