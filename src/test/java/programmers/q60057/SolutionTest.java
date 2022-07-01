package programmers.q60057;

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
        assertThat(solution.solution("aabbaccc")).isEqualTo(7);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution("ababcdcdababcdcd")).isEqualTo(9);
    }

    @Test
    void testCase3() {
        assertThat(solution.solution("abcabcdede")).isEqualTo(8);
    }

    @Test
    void testCase4() {
        assertThat(solution.solution("abcabcabcabcdededededede")).isEqualTo(14);
    }

    @Test
    void testCase5() {
        assertThat(solution.solution("xababcdcdababcdcd")).isEqualTo(17);
    }
}