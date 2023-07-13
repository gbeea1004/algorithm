package programmers.q12909;

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
    String s = "()()";

    boolean result = solution.solution(s);

    assertThat(result).isTrue();
  }

  @Test
  void testCase2() {
    String s = "(())()";

    boolean result = solution.solution(s);

    assertThat(result).isTrue();
  }

  @Test
  void testCase3() {
    String s = ")()(";

    boolean result = solution.solution(s);

    assertThat(result).isFalse();
  }

  @Test
  void testCase4() {
    String s = "(()(";

    boolean result = solution.solution(s);

    assertThat(result).isFalse();
  }
}