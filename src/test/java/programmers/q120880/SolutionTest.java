package programmers.q120880;

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
    int[] numlist = {1, 2, 3, 4, 5, 6};
    int n = 4;

    int[] result = solution.solution(numlist, n);

    assertThat(result).isEqualTo(new int[]{4, 5, 3, 6, 2, 1});
  }

  @Test
  void testCase2() {
    int[] numlist = {10000, 20, 36, 47, 40, 6, 10, 7000};
    int n = 30;

    int[] result = solution.solution(numlist, n);

    assertThat(result).isEqualTo(new int[]{36, 40, 20, 47, 10, 6, 7000, 10000});
  }
}