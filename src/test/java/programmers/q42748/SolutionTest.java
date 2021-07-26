package programmers.q42748;

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
        int[] result = this.solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

        assertThat(result).isEqualTo(new int[]{5, 6, 3});
    }

    @Test
    void testCase2() {
        int[] result = this.solution.solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 1, 1}, {4, 4, 1}, {1, 5, 3}});

        assertThat(result).isEqualTo(new int[]{1, 4, 3});
    }
}