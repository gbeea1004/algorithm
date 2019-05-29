package baekjoon.q2163;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    public void testCase_1() {
        assertThat(Solution.solution(2, 2)).isEqualTo(3);
    }

    @Test
    public void testCase_2() {
        assertThat(Solution.solution(1, 3)).isEqualTo(2);
    }

    @Test
    public void testCase_3() {
        assertThat(Solution.solution(1, 1)).isEqualTo(0);
    }

    @Test
    public void testCase_4() {
        assertThat(Solution.solution(3, 3)).isEqualTo(8);
    }

    @Test
    public void testCase_5() {
        assertThat(Solution.solution(3, 2)).isEqualTo(5);
    }
}