package programmers.q12899;

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
        assertThat(solution.solution(1)).isEqualTo("1");
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(2)).isEqualTo("2");
    }

    @Test
    void testCase3() {
        assertThat(solution.solution(3)).isEqualTo("4");
    }

    @Test
    void testCase4() {
        assertThat(solution.solution(4)).isEqualTo("11");
    }

    @Test
    void testCase5() {
        assertThat(solution.solution(9)).isEqualTo("24");
    }
}