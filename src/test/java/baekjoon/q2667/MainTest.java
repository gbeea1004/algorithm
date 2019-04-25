package baekjoon.q2667;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class MainTest {
    @Test
    public void inputCase1() {
        Solution solution = new Solution();
        int[][] map = {
                {0, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0}};

        List<Integer> result = solution.solution(7, map);
        assertThat(result.size()).isEqualTo(3);
        assertThat(result.get(0)).isEqualTo(7);
        assertThat(result.get(1)).isEqualTo(8);
        assertThat(result.get(2)).isEqualTo(9);
    }
}