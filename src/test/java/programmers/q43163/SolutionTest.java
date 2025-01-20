package programmers.q43163;

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
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        // when
        int result = solution.solution(begin, target, words);

        // then
        assertThat(result).isEqualTo(4);
    }

    @Test
    void testCase2() {
        // given
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log"};

        // when
        int result = solution.solution(begin, target, words);

        // then
        assertThat(result).isEqualTo(0);
    }
}