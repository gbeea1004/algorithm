package programmers.q181943;

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
    String myString = "He11oWor1d";
    String overWriteString = "lloWorl";
    int s = 2;

    String result = solution.solution(myString, overWriteString, s);

    assertThat(result).isEqualTo("HelloWorld");
  }
}