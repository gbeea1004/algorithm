package programmers.q72411;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testCase1() {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};
        assertThat(solution.solution(orders, course)).isEqualTo(new String[]{"AC", "ACDE", "BCFG", "CDE"});
    }

    @Test
    void testCase2() {
        String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course = {2, 3, 5};
        assertThat(solution.solution(orders, course)).isEqualTo(new String[]{"ACD", "AD", "ADE", "CD", "XYZ"});
    }

    @Test
    void testCase3() {
        String[] orders = {"XYZ", "XWY", "WXA"};
        int[] course = {2, 3, 4};
        assertThat(solution.solution(orders, course)).isEqualTo(new String[]{"WX", "XY"});
    }
}