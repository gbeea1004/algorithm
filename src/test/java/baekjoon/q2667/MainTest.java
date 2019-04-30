package baekjoon.q2667;

import base.BaseTest;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class MainTest extends BaseTest {
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
        softly.assertThat(result.size()).isEqualTo(3);
        softly.assertThat(result.get(0)).isEqualTo(7);
        softly.assertThat(result.get(1)).isEqualTo(8);
        softly.assertThat(result.get(2)).isEqualTo(9);
    }
}