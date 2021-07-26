package coding_test.y2019.kakao_blind2020.q1;

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
        assertThat(solution.solution("aabbaccc")).isEqualTo(7);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution("ababcdcdababcdcd")).isEqualTo(9);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution("abcabcdede")).isEqualTo(8);
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution("abcabcabcabcdededededede")).isEqualTo(14);
    }

    @Test
    public void testCase_5() {
        assertThat(solution.solution("xababcdcdababcdcd")).isEqualTo(17);
    }
}