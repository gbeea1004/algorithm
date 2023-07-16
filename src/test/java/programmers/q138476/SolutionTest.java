package programmers.q138476;

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
    int k = 6;
    int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

    int result = solution.solution(k, tangerine);

    assertThat(result).isEqualTo(3);
  }

  @Test
  void testCase2() {
    int k = 4;
    int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

    int result = solution.solution(k, tangerine);

    assertThat(result).isEqualTo(2);
  }

  @Test
  void testCase3() {
    int k = 2;
    int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};

    int result = solution.solution(k, tangerine);

    assertThat(result).isEqualTo(1);
  }
}