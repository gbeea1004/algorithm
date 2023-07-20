package programmers.q135808;

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
    int k = 3;
    int m = 4;
    int[] score = {1, 2, 3, 1, 2, 3, 1};

    int result = solution.solution(k, m, score);

    assertThat(result).isEqualTo(8);
  }

  @Test
  void testCase2() {
    int k = 4;
    int m = 3;
    int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

    int result = solution.solution(k, m, score);

    assertThat(result).isEqualTo(33);
  }
}