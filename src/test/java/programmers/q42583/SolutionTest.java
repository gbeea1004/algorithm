package programmers.q42583;

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
        int bridgeLength = 2;
        int weight = 10;
        int[] truckWeights = {7, 4, 5, 6};

        // when
        int result = solution.solution(bridgeLength, weight, truckWeights);

        // then
        assertThat(result).isEqualTo(8);
    }

    @Test
    void testCase2() {
        // given
        int bridgeLength = 100;
        int weight = 100;
        int[] truckWeights = {10};

        // when
        int result = solution.solution(bridgeLength, weight, truckWeights);

        // then
        assertThat(result).isEqualTo(101);
    }

    @Test
    void testCase3() {
        // given
        int bridgeLength = 100;
        int weight = 100;
        int[] truckWeights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        // when
        int result = solution.solution(bridgeLength, weight, truckWeights);

        // then
        assertThat(result).isEqualTo(110);
    }
}