package programmers.q118666;

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
    String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
    int[] choices = {5, 3, 2, 7, 5};

    String result = solution.solution(survey, choices);

    assertThat(result).isEqualTo("TCMA");
  }

  @Test
  void testCase2() {
    String[] survey = {"TR", "RT", "TR"};
    int[] choices = {7, 1, 3};

    String result = solution.solution(survey, choices);

    assertThat(result).isEqualTo("RCJA");
  }
}