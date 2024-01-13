package programmers.q181908;

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
    String myString = "banana";
    String isSuffix = "ana";

    int result = solution.solution(myString, isSuffix);

    assertThat(result).isEqualTo(1);
  }
}