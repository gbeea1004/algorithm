package coding_test.y2019.zoom.q4;

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
        assertThat(solution.solution(new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9})).isEqualTo(5);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new int[]{100})).isEqualTo(1);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new int[]{50, 150, 50, 150, 50, 150})).isEqualTo(6);
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution(new int[]{4, 8, 12, 16})).isEqualTo(2);
    }
}