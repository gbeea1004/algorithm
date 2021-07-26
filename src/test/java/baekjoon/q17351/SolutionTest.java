package baekjoon.q17351;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testCase_1() {
        assertThat(solution.solution(new String[][]{
                {"M", "O", "L", "A"},
                {"A", "M", "O", "L"},
                {"F", "A", "T", "I"},
                {"M", "O", "L", "A"}})).isEqualTo(1);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(new String[][]{
                {"M", "O", "L", "A", "M"},
                {"O", "L", "X", "X", "O"},
                {"X", "A", "M", "O", "A"},
                {"X", "X", "X", "L", "A"},
                {"M", "O", "L", "A", "M"}})).isEqualTo(2);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(new String[][]{
                {"M", "O", "L", "L", "A"},
                {"M", "O", "L", "L", "A"},
                {"M", "O", "L", "L", "A"},
                {"M", "O", "L", "L", "A"},
                {"M", "O", "L", "L", "A"}})).isEqualTo(0);
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution(new String[][]{
                {"S", "U", "N", "R", "I", "N"},
                {"A", "M", "U", "M", "A", "L"},
                {"S", "T", "R", "I", "N", "G"},
                {"M", "O", "L", "A", "A", "A"},
                {"K", "K", "K", "M", "O", "O"},
                {"O", "O", "O", "O", "L", "A"}})).isEqualTo(2);
    }

    @Test
    public void testCase_5() {
        assertThat(solution.solution(new String[][]{
                {"M", "O", "L", "A", "M", "O"},
                {"O", "L", "A", "A", "O", "L"},
                {"L", "A", "M", "A", "A", "A"},
                {"A", "A", "O", "L", "A", "M"},
                {"M", "O", "L", "A", "M", "O"},
                {"L", "L", "L", "L", "O", "A"}})).isEqualTo(2);
    }

    @Test
    public void testCase_6() {
        assertThat(solution.solution(new String[][]{
                {"M", "O", "X", "X", "X"},
                {"X", "L", "A", "M", "M"},
                {"X", "M", "X", "O", "L"},
                {"M", "O", "L", "A", "A"},
                {"X", "X", "X", "X", "A"}})).isEqualTo(2);
    }

    @Test
    public void testCase_7() {
        assertThat(solution.solution(new String[][]{
                {"M"}})).isEqualTo(0);
    }

    @Test
    public void testCase_8() {
        assertThat(solution.solution(new String[][]{
                {"M", "O", "L", "A", "Q"},
                {"O", "L", "A", "Q", "M"},
                {"L", "A", "Q", "M", "O"},
                {"A", "Q", "M", "O", "L"},
                {"Q", "M", "O", "L", "A"}})).isEqualTo(2);
    }
}