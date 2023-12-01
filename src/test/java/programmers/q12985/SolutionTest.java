package programmers.q12985;

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
    int n = 8;
    int a = 4;
    int b = 7;

    assertThat(solution.solution(n, a, b)).isEqualTo(3);
  }
}