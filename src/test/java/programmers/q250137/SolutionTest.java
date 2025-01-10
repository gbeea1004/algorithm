package programmers.q250137;

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
        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};

        // when
        int result = solution.solution(bandage, health, attacks);

        // then
        assertThat(result).isEqualTo(5);
    }

    @Test
    void testCase2() {
        // given
        int[] bandage = {3, 2, 7};
        int health = 20;
        int[][] attacks = {{1, 15}, {5, 16}, {8, 6}};

        // when
        int result = solution.solution(bandage, health, attacks);

        // then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void testCase3() {
        // given
        int[] bandage = {1, 1, 1};
        int health = 5;
        int[][] attacks = {{1, 2}, {3, 2}};

        // when
        int result = solution.solution(bandage, health, attacks);

        // then
        assertThat(result).isEqualTo(3);
    }
}