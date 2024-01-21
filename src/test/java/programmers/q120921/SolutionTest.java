package programmers.q120921;

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
    String a = "hello";
    String b = "ohell";

    int result = solution.solution(a, b);

    assertThat(result).isEqualTo(1);
  }
}