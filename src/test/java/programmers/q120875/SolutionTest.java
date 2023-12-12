package programmers.q120875;

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
    int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};

    assertThat(solution.solution(dots)).isEqualTo(1);
  }

  @Test
  void testCase2() {
    int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};

    assertThat(solution.solution(dots)).isEqualTo(0);
  }
}