package programmers.q60059;

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
        int[][] key = new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] lock = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        assertThat(solution.solution(key, lock)).isEqualTo(true);
    }

    @Test
    public void testCase_2() {
        int[][] key = new int[][]{{0, 0}, {1, 0}};
        int[][] lock = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        assertThat(solution.solution(key, lock)).isEqualTo(false);
    }

    @Test
    public void testCase_3() {
        int[][] key = new int[][]{{0, 0}, {1, 0}};
        int[][] lock = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 1, 1}};

        assertThat(solution.solution(key, lock)).isEqualTo(true);
    }

    @Test
    public void testCase_4() {
        int[][] key = new int[][]{{1, 0}, {1, 0}};
        int[][] lock = new int[][]{{1, 1, 1}, {1, 1, 1}, {0, 0, 1}};

        assertThat(solution.solution(key, lock)).isEqualTo(true);
    }

    @Test
    public void 회전이_잘_되는가() {
        int[][] key = new int[][]{{1, 1}, {0, 0}};

        // 90도 회전
        key = solution.rotateKey(key);
        assertThat(key).isEqualTo(new int[][]{{0, 1}, {0, 1}});

        // 180도 회전
        key = solution.rotateKey(key);
        assertThat(key).isEqualTo(new int[][]{{0, 0}, {1, 1}});

        // 270도 회전
        key = solution.rotateKey(key);
        assertThat(key).isEqualTo(new int[][]{{1, 0}, {1, 0}});

        // 360도 회전
        key = solution.rotateKey(key);
        assertThat(key).isEqualTo(new int[][]{{1, 1}, {0, 0}});
    }
}