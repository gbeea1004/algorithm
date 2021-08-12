package programmers.q83201;

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
    void testCase_1() {
        assertThat(solution.solution(new int[][]{{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}})).isEqualTo("FBABD");
    }

    @Test
    void testCase_2() {
        assertThat(solution.solution(new int[][]{{50, 90}, {50, 87}})).isEqualTo("DA");
    }

    @Test
    void testCase_3() {
        assertThat(solution.solution(new int[][]{{70, 49, 90}, {68, 50, 38}, {73, 31, 100}})).isEqualTo("CFD");
    }
}