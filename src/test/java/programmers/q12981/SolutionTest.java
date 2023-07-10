package programmers.q12981;

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
    int n = 3;
    String[] words = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

    int[] result = solution.solution(n, words);

    assertThat(result).isEqualTo(new int[]{3, 3});
  }

  @Test
  void testCase2() {
    int n = 5;
    String[] words = new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};

    int[] result = solution.solution(n, words);

    assertThat(result).isEqualTo(new int[]{0, 0});
  }

  @Test
  void testCase3() {
    int n = 2;
    String[] words = new String[]{"hello", "one", "even", "never", "now", "world", "draw"};

    int[] result = solution.solution(n, words);

    assertThat(result).isEqualTo(new int[]{1, 3});
  }
}