package programmers.q17682;

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
        assertThat(solution.solution("1S2D*3T")).isEqualTo(37);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution("1D2S#10S")).isEqualTo(9);
    }

    @Test
    void testCase3() {
        assertThat(solution.solution("1D2S0T")).isEqualTo(3);
    }

    @Test
    void testCase4() {
        assertThat(solution.solution("1S*2T*3S")).isEqualTo(23);
    }

    @Test
    void testCase5() {
        assertThat(solution.solution("1D#2S*3S")).isEqualTo(5);
    }

    @Test
    void testCase6() {
        assertThat(solution.solution("1T2D3D#")).isEqualTo(-4);
    }

    @Test
    void testCase7() {
        assertThat(solution.solution("1D2S3T*")).isEqualTo(59);
    }
}