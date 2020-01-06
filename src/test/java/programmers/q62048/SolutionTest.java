package programmers.q62048;

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
        assertThat(solution.solution(8, 12)).isEqualTo(80);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(2, 3)).isEqualTo(2);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(3, 5)).isEqualTo(8);
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution(4, 3)).isEqualTo(6);
    }

    @Test
    public void testCase_5() {
        assertThat(solution.solution(1, 3)).isEqualTo(0);
    }

    @Test
    public void testCase_6() {
        assertThat(solution.solution(3, 3)).isEqualTo(6);
    }
}