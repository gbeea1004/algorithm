package programmers.q161989;

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
    int m = 4;
    int[] section = {2, 3, 6};

    int result = solution.solution(n, m, section);

    assertThat(result).isEqualTo(2);
  }

  @Test
  void testCase2() {
    int n = 5;
    int m = 4;
    int[] section = {1, 3};

    int result = solution.solution(n, m, section);

    assertThat(result).isEqualTo(1);
  }

  @Test
  void testCase3() {
    int n = 4;
    int m = 1;
    int[] section = {1, 2, 3, 4};

    int result = solution.solution(n, m, section);

    assertThat(result).isEqualTo(4);
  }
}