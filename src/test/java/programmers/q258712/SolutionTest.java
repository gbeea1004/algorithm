package programmers.q258712;

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
    String[] friends = {"muzi", "ryan", "frodo", "neo"};
    String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

    int result = solution.solution(friends, gifts);

    assertThat(result).isEqualTo(2);
  }

  @Test
  void testCase2() {
    String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
    String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};

    int result = solution.solution(friends, gifts);

    assertThat(result).isEqualTo(4);
  }

  @Test
  void testCase3() {
    String[] friends = {"a", "b", "c"};
    String[] gifts = {"a b", "b a", "c a", "a c", "a c", "c a"};

    int result = solution.solution(friends, gifts);

    assertThat(result).isEqualTo(0);
  }
}