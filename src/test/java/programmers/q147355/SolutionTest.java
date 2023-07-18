package programmers.q147355;

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
        String number = "3141592";
        String number1 = "271";

        int result = solution.solution(number, number1);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void testCase2() {
        String number = "1";
        String number1 = "1";

        int result = solution.solution(number, number1);

        assertThat(result).isEqualTo(1);
    }
}