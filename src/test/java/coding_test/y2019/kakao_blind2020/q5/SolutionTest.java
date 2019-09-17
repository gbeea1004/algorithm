package coding_test.y2019.kakao_blind2020.q5;

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
        assertThat(solution.solution(5, new int[][]{{1, 0, 0, 1}, {1, 1, 1, 1}, {2, 1, 0, 1}, {2, 2, 1, 1}, {5, 0, 0, 1}, {5, 1, 0, 1}, {4, 2, 1, 1}, {3, 2, 1, 1}}))
                .isEqualTo(new int[][]{{1, 0, 0}, {1, 1, 1}, {2, 1, 0}, {2, 2, 1}, {3, 2, 1}, {4, 2, 1}, {5, 0, 0}, {5, 1, 0}});
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(5, new int[][]{{0, 0, 0, 1}, {2, 0, 0, 1}, {4, 0, 0, 1}, {0, 1, 1, 1}, {1, 1, 1, 1}, {2, 1, 1, 1}, {3, 1, 1, 1}, {2, 0, 0, 0}, {1, 1, 1, 0}, {2, 2, 0, 1}}))
                .isEqualTo(new int[][]{{0, 0, 0}, {0, 1, 1}, {1, 1, 1}, {2, 1, 1}, {3, 1, 1}, {4, 0, 0}});
    }
}