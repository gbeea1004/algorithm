package programmers.q49994;

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
        String dirs = "ULURRDLLU";

        // when
        int result = solution.solution(dirs);

        // then
        assertThat(result).isEqualTo(7);
    }
}