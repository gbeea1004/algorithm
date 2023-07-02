package programmers.q178871;

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
    String[] players = new String[]{"mumu", "soe", "poe", "kai", "mine"};
    String[] callings = new String[]{"kai", "kai", "mine", "mine"};

    String[] result = solution.solution(players, callings);

    assertThat(result).isEqualTo(new String[]{"mumu", "kai", "mine", "soe", "poe"});
  }
}