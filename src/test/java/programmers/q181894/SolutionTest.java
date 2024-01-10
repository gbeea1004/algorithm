package programmers.q181894;

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
    int[] arr = {1, 2, 1, 4, 5, 2, 9};

    int[] result = solution.solution(arr);

    assertThat(result).isEqualTo(new int[]{2, 1, 4, 5, 2});
  }
}