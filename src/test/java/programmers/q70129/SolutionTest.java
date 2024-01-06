package programmers.q70129;

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
    String s = "110010101001";

    int[] result = solution.solution(s);

    assertThat(result).isEqualTo(new int[]{3, 8});
  }

  @Test
  void testCase2() {
    String s = "01110";

    int[] result = solution.solution(s);

    assertThat(result).isEqualTo(new int[]{3, 3});
  }

  @Test
  void testCase3() {
    String s = "1111111";

    int[] result = solution.solution(s);

    assertThat(result).isEqualTo(new int[]{4, 1});
  }
}
