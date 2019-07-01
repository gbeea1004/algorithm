package baekjoon.q10798;

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
        assertThat(solution.solution(new String[][]{
                {"A", "B", "C", "D", "E"},
                {"a", "b", "c", "d", "e"},
                {"0", "1", "2", "3", "4"},
                {"F", "G", "H", "I", "J"},
                {"f", "g", "h", "i", "j"}}))
                .isEqualTo("Aa0FfBb1GgCc2HhDd3IiEe4Jj");
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new String[][]{
                {"A", "A", "B", "C", "D", "D"},
                {"a", "f", "z", "z"},
                {"0", "9", "1", "2", "1",},
                {"a", "8", "E", "W", "g", "6"},
                {"P", "5", "h", "3", "k", "x"}}))
                .isEqualTo("Aa0aPAf985Bz1EhCz2W3D1gkD6x");
    }
}