package programmers.q17682;

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
        assertThat(solution.solution("1S2D*3T")).isEqualTo(37);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution("1D2S#10S")).isEqualTo(9);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution("1D2S0T")).isEqualTo(3);
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution("1S*2T*3S")).isEqualTo(23);
    }

    @Test
    public void testCase_5() {
        assertThat(solution.solution("1D#2S*3S")).isEqualTo(5);
    }

    @Test
    public void testCase_6() {
        assertThat(solution.solution("1T2D3D#")).isEqualTo(-4);
    }

    @Test
    public void testCase_7() {
        assertThat(solution.solution("1D2S3T*")).isEqualTo(59);
    }

    @Test
    public void testCase_8() {
        assertThat(solution.solution("10S#1S#1S*")).isEqualTo(-10);
    }

    @Test
    public void testCase_9() {
        assertThat(solution.solution("2T2D#1S#1S*")).isEqualTo(4);
    }

    @Test
    public void testCase_10() {
        assertThat(solution.solution("0T10D")).isEqualTo(100);
    }
}