package programmers.q181893;

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
    int[] arr = {0, 1, 2, 3, 4, 5};
    int[] query = {4, 1, 2};

    assertThat(solution.solution(arr, query)).isEqualTo(new int[]{1, 2, 3});
  }
}