package programmers.q64065;

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
        assertThat(solution.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")).isEqualTo(new int[]{2, 1, 3, 4});
    }

    @Test
    void testCase2() {
        assertThat(solution.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")).isEqualTo(new int[]{2, 1, 3, 4});
    }

    @Test
    void testCase3() {
        assertThat(solution.solution("{{20,111},{111}}")).isEqualTo(new int[]{111, 20});
    }

    @Test
    void testCase4() {
        assertThat(solution.solution("{{123}}")).isEqualTo(new int[]{123});
    }

    @Test
    void testCase5() {
        assertThat(solution.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")).isEqualTo(new int[]{3, 2, 4, 1});
    }
}