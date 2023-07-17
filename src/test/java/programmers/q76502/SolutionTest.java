package programmers.q76502;

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
        String s = "[](){}";

        int result = solution.solution(s);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void testCase2() {
        String s = "}]()[{";

        int result = solution.solution(s);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void testCase3() {
        String s = "[)(]";

        int result = solution.solution(s);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void testCase4() {
        String s = "}}}";

        int result = solution.solution(s);

        assertThat(result).isEqualTo(0);
    }
}