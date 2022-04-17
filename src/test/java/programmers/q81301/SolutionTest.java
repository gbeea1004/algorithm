package programmers.q81301;

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
        assertThat(solution.solution("one4seveneight")).isEqualTo(1478);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution("23four5six7")).isEqualTo(234567);
    }

    @Test
    void testCase3() {
        assertThat(solution.solution("2three45sixseven")).isEqualTo(234567);
    }

    @Test
    void testCase4() {
        assertThat(solution.solution("123")).isEqualTo(123);
    }
}