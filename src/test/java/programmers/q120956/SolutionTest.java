package programmers.q120956;

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
    String[] babbling = new String[]{"aya", "yee", "u", "maa", "wyeoo"};

    int result = solution.solution(babbling);

    assertThat(result).isEqualTo(1);
  }

  @Test
  void testCase2() {
    String[] babbling = new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

    int result = solution.solution(babbling);

    assertThat(result).isEqualTo(3);
  }
}