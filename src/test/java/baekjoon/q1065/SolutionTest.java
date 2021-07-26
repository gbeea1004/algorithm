package baekjoon.q1065;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    public void testCase_1() {
        assertThat(Solution.solution(110)).isEqualTo(99);
    }

    @Test
    public void testCase_2() {
        assertThat(Solution.solution(1)).isEqualTo(1);
    }

    @Test
    public void testCase_3() {
        assertThat(Solution.solution(210)).isEqualTo(105);
    }

    @Test
    public void testCase_4() {
        assertThat(Solution.solution(1000)).isEqualTo(144);
    }
}