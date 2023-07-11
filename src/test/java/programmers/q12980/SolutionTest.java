package programmers.q12980;

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
    int n = 5;

    int result = solution.solution(n);

    assertThat(result).isEqualTo(2);
  }

  @Test
  void testCase2() {
    int n = 6;

    int result = solution.solution(n);

    assertThat(result).isEqualTo(2);
  }

  @Test
  void testCase3() {
    int n = 5000;

    int result = solution.solution(n);

    assertThat(result).isEqualTo(5);
  }

  @Test
  void testCase4() {
    int n = 7;

    int result = solution.solution(n);

    assertThat(result).isEqualTo(3);
  }
}