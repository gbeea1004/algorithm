package programmers.q42885;

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
    int[] people = {70, 50, 80, 50};
    int limit = 100;

    assertThat(solution.solution(people, limit)).isEqualTo(3);
  }
}