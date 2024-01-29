package programmers.q120884;

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
    int chicken = 1081;

    int result = solution.solution(chicken);

    assertThat(result).isEqualTo(120);
  }
}