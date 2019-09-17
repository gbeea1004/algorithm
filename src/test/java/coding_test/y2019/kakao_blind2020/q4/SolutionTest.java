package coding_test.y2019.kakao_blind2020.q4;

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
        assertThat(solution.solution(new String[]{"frodo", "front", "frost", "frozen", "frame", "kakao"},
                new String[]{"fro??", "????o", "fr???", "fro???", "pro?"})).isEqualTo(new int[]{3, 2, 4, 1, 0});
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new String[]{"frodo"},
                new String[]{"fro??", "????o"})).isEqualTo(new int[]{1, 1});
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new String[]{"adv"},
                new String[]{"???", "?dv", "ad?", "?cv"})).isEqualTo(new int[]{1, 1, 1, 0});
    }
}