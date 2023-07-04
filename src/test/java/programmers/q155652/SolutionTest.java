package programmers.q155652;

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
    String s = "aukks";
    String skip = "wbqd";
    int index = 5;

    String result = solution.solution(s, skip, index);

    assertThat(result).isEqualTo("happy");
  }
}