package programmers.q72410;

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
    void testCase_1() {
        assertThat(solution.solution("...!@BaT#*..y.abcdefghijklm")).isEqualTo("bat.y.abcdefghi");
    }

    @Test
    void testCase_2() {
        assertThat(solution.solution(".1.")).isEqualTo("111");
    }

    @Test
    void testCase_3() {
        assertThat(solution.solution("=.=")).isEqualTo("aaa");
    }
}