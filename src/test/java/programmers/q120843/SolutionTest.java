package programmers.q120843;

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
    int[] numbers = {1, 2, 3, 4};
    int k = 2;

    int result = solution.solution(numbers, k);

    assertThat(result).isEqualTo(3);
  }
}