package programmers.q76501;

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
        assertThat(solution.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true})).isEqualTo(9);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(new int[]{1, 2, 3}, new boolean[]{false,false,true})).isEqualTo(0);
    }
}