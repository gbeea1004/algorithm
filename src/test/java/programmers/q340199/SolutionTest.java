package programmers.q340199;

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
        int[] wallet = {30, 15};
        int[] bill = {26, 17};

        // when
        int result = solution.solution(wallet, bill);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void testCase2() {
        // given
        int[] wallet = {50, 50};
        int[] bill = {100, 241};

        // when
        int result = solution.solution(wallet, bill);

        // then
        assertThat(result).isEqualTo(4);
    }
}