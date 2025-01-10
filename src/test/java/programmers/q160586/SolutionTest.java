package programmers.q160586;

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
        // given
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};

        // when
        int[] result = solution.solution(keymap, targets);

        // then
        assertThat(result).isEqualTo(new int[]{9, 4});
    }

    @Test
    void testCase2() {
        // given
        String[] keymap = {"AA"};
        String[] targets = {"B"};

        // when
        int[] result = solution.solution(keymap, targets);

        // then
        assertThat(result).isEqualTo(new int[]{-1});
    }

    @Test
    void testCase3() {
        // given
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "DG", "AABB"};

        // when
        int[] result = solution.solution(keymap, targets);

        // then
        assertThat(result).isEqualTo(new int[]{9, -1, 4});
    }
}