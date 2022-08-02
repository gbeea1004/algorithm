package programmers.q17677;

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
        assertThat(solution.solution("FRANCE", "french")).isEqualTo(16384);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution("handshake", "shake hands")).isEqualTo(65536);
    }

    @Test
    void testCase3() {
        assertThat(solution.solution("aa1+aa2", "AAAA12")).isEqualTo(43690);
    }

    @Test
    void testCase4() {
        assertThat(solution.solution("E=M*C^2", "e=m*c^2")).isEqualTo(65536);
    }
}