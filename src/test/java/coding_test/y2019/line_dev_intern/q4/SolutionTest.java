package coding_test.y2019.line_dev_intern.q4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    @Test
    public void testCase_1() {
        assertThat(Solution.solution(new int[]{1, 0, 1, 0, 0, 0, 1})).isEqualTo(2);
    }

    @Test
    public void testCase_2() {
        assertThat(Solution.solution(new int[]{1, 0, 1})).isEqualTo(1);
    }

    @Test
    public void testCase_3() {
        assertThat(Solution.solution(new int[]{1, 0})).isEqualTo(1);
    }

    @Test
    public void testCase_4() {
        assertThat(Solution.solution(new int[]{1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1})).isEqualTo(3);
    }

    @Test
    public void testCase_5() {
        assertThat(Solution.solution(new int[]{1, 0, 0, 0, 0, 0})).isEqualTo(5);
    }

    @Test
    public void testCase_6() {
        assertThat(Solution.solution(new int[]{0, 0, 0, 0, 0, 1})).isEqualTo(5);
    }
}