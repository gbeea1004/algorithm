package programmers.q159994;

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
    String[] cards1 = {"i", "drink", "water"};
    String[] cards2 = {"want", "to"};
    String[] goal = {"i", "want", "to", "drink", "water"};

    String result = solution.solution(cards1, cards2, goal);

    assertThat(result).isEqualTo("Yes");
  }

  @Test
  void testCase2() {
    String[] cards1 = {"i", "water", "drink"};
    String[] cards2 = {"want", "to"};
    String[] goal = {"i", "want", "to", "drink", "water"};

    String result = solution.solution(cards1, cards2, goal);

    assertThat(result).isEqualTo("No");
  }
}