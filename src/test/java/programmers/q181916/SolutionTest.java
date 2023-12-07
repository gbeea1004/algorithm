package programmers.q181916;

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
    assertThat(solution.solution(2, 2, 2, 2)).isEqualTo(2222);
  }

  @Test
  void testCase2() {
    assertThat(solution.solution(4, 1, 4, 4)).isEqualTo(1681);
  }

  @Test
  void testCase3() {
    assertThat(solution.solution(6, 3, 3, 6)).isEqualTo(27);
  }

  @Test
  void testCase4() {
    assertThat(solution.solution(2, 5, 2, 6)).isEqualTo(30);
  }

  @Test
  void testCase5() {
    assertThat(solution.solution(6, 4, 2, 5)).isEqualTo(2);
  }
}