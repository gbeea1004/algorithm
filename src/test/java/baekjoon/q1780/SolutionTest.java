package baekjoon.q1780;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void testCase_1() {
        Solution solution = new Solution();
        int[][] paper = {
                {0, 0, 0, 1, 1, 1, -1, -1, -1},
                {0, 0, 0, 1, 1, 1, -1, -1, -1},
                {0, 0, 0, 1, 1, 1, -1, -1, -1},
                {1, 1, 1, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 1, -1, 0, 1, -1, 0, 1, -1},
                {0, -1, 1, 0, 1, -1, 0, 1, -1},
                {0, 1, -1, 1, 0, -1, 0, 1, -1}};

        Map<Integer, Integer> result = solution.solution(paper);
        assertThat(result.get(-1), is(10));
        assertThat(result.get(0), is(12));
        assertThat(result.get(1), is(11));
    }

    @Test
    public void testCase_2() {
        Solution solution = new Solution();
        int[][] paper = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}};

        Map<Integer, Integer> result = solution.solution(paper);
        assertThat(result.get(-1), is(0));
        assertThat(result.get(0), is(1));
        assertThat(result.get(1), is(0));
    }

    @Test
    public void testCase_3() {
        Solution solution = new Solution();
        int[][] paper = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1}};

        Map<Integer, Integer> result = solution.solution(paper);
        assertThat(result.get(-1), is(0));
        assertThat(result.get(0), is(16));
        assertThat(result.get(1), is(1));
    }
}