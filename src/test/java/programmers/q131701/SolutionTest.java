package programmers.q131701;

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
    int[] elements = {7, 9, 1, 1, 4};

    int result = solution.solution(elements);

    assertThat(result).isEqualTo(18);
  }
}