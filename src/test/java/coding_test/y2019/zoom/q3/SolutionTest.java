package coding_test.y2019.zoom.q3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testCase_1() {
        assertThat(solution.solution(new int[][]{
                {4, 3, 4, 5, 3},
                {2, 7, 3, 8, 4},
                {1, 7, 6, 5, 2},
                {8, 4, 9, 5, 5}
        })).isEqualTo(3);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[][]{
                {2, 2, 1, 1},
                {2, 2, 2, 2},
                {1, 2, 2, 2}
        })).isEqualTo(2);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new int[][]{
                {7, 2, 4},
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8},
                {3, 5, 4}
        })).isEqualTo(3);
    }
}