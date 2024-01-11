package programmers.q181890;

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
    String[] strList = {"a", "a", "r", "b"};

    String[] result = solution.solution(strList);

    assertThat(result).isEqualTo(new String[]{"b"});
  }
}