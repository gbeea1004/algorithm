package programmers.q12949;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

  private Solution solution;

  @BeforeEach
  void setUp() {
    solution = new Solution();
  }

  @Test
  void testCase1() {
    int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
    int[][] arr2 = {{3, 3}, {3, 3}};

    int[][] result = solution.solution(arr1, arr2);

    assertThat(result).isEqualTo(new int[][]{{15, 15}, {15, 15}, {15, 15}});
  }
}