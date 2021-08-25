package programmers.q84021;

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
        assertThat(solution.solution(
                new int[][]{
                        {1, 1, 0, 0, 1, 0},
                        {0, 0, 1, 0, 1, 0},
                        {0, 1, 1, 0, 0, 1},
                        {1, 1, 0, 1, 1, 1},
                        {1, 0, 0, 0, 1, 0},
                        {0, 1, 1, 1, 0, 0}
                },
                new int[][]{
                        {1, 0, 0, 1, 1, 0},
                        {1, 0, 1, 0, 1, 0},
                        {0, 1, 1, 0, 1, 1},
                        {0, 0, 1, 0, 0, 0},
                        {1, 1, 0, 1, 1, 0},
                        {0, 1, 0, 0, 0, 0}
                })).isEqualTo(14);
    }

    @Test
    void testCase_2() {
        assertThat(solution.solution(
                new int[][]{
                        {0, 0, 0},
                        {1, 1, 0},
                        {1, 1, 1}
                },
                new int[][]{
                        {1, 1, 1},
                        {1, 0, 0},
                        {0, 0, 0}
                })).isEqualTo(0);
    }

    @Test
    void testCase_3() {
        assertThat(solution.solution(
                new int[][]{
                        {1, 0, 1},
                        {0, 0, 0},
                        {1, 1, 1}
                },
                new int[][]{
                        {0, 0, 1},
                        {0, 1, 1},
                        {0, 0, 1}
                })).isEqualTo(1);
    }

    @Test
    void testCase_4() {
        assertThat(solution.solution(
                new int[][]{
                        {1, 0, 1},
                        {1, 1, 1},
                        {1, 1, 1}
                },
                new int[][]{
                        {0, 0, 1},
                        {0, 0, 0},
                        {0, 0, 0}
                })).isEqualTo(1);
    }
}