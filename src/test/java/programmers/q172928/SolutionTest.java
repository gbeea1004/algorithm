package programmers.q172928;

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
    String[] park = new String[]{"SOO","OOO","OOO"};
    String[] routes = new String[]{"E 2","S 2","W 1"};

    int[] result = solution.solution(park, routes);

    assertThat(result[0]).isEqualTo(2);
    assertThat(result[1]).isEqualTo(1);
  }

  @Test
  void testCase2() {
    String[] park = new String[]{"SOO","OXX","OOO"};
    String[] routes = new String[]{"E 2","S 2","W 1"};

    int[] result = solution.solution(park, routes);

    assertThat(result[0]).isEqualTo(0);
    assertThat(result[1]).isEqualTo(1);
  }

  @Test
  void testCase3() {
    String[] park = new String[]{"OSO","OOO","OXO","OOO"};
    String[] routes = new String[]{"E 2","S 3","W 1"};

    int[] result = solution.solution(park, routes);

    assertThat(result[0]).isEqualTo(0);
    assertThat(result[1]).isEqualTo(0);
  }
}