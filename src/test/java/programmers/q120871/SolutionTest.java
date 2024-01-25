package programmers.q120871;

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
    int n = 15;

    int result = solution.solution(n);

    assertThat(result).isEqualTo(25);
  }

  @Test
  void testCase2() {
    int n = 3;

    int result = solution.solution(n);

    assertThat(result).isEqualTo(4);
  }
}