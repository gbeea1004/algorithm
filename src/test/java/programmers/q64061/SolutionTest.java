package programmers.q64061;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testCase_1() {
        int[][] board = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};

        assertThat(solution.solution(board, moves)).isEqualTo(4);
    }

    @Test
    public void testCase_2() {
        int[][] board = new int[][]{
                {0, 0},
                {0, 0}
        };
        int[] moves = new int[]{1, 1};

        assertThat(solution.solution(board, moves)).isEqualTo(0);
    }

    @Test
    public void testCase_3() {
        int[][] board = new int[][]{
                {0, 1},
                {0, 1},
                {0, 1},
                {0, 1}
        };
        int[] moves = new int[]{2, 2, 2, 2};

        assertThat(solution.solution(board, moves)).isEqualTo(4);
    }
}