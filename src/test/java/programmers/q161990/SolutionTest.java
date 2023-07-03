package programmers.q161990;

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
    String[] wallpaper = new String[]{".#...", "..#..", "...#."};

    int[] result = solution.solution(wallpaper);

    assertThat(result).isEqualTo(new int[]{0, 1, 3, 4});
  }

  @Test
  void testCase2() {
    String[] wallpaper = new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."};

    int[] result = solution.solution(wallpaper);

    assertThat(result).isEqualTo(new int[]{1, 3, 5, 8});
  }

  @Test
  void testCase3() {
    String[] wallpaper = new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};

    int[] result = solution.solution(wallpaper);

    assertThat(result).isEqualTo(new int[]{0, 0, 7, 9});
  }

  @Test
  void testCase4() {
    String[] wallpaper = new String[]{"..", "#."};

    int[] result = solution.solution(wallpaper);

    assertThat(result).isEqualTo(new int[]{1, 0, 2, 1});
  }
}