package programmers.q17680;

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
    int cacheSize = 3;
    String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

    int result = solution.solution(cacheSize, cities);

    assertThat(result).isEqualTo(50);
  }

  @Test
  void testCase2() {
    int cacheSize = 3;
    String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};

    int result = solution.solution(cacheSize, cities);

    assertThat(result).isEqualTo(21);
  }

  @Test
  void testCase3() {
    int cacheSize = 2;
    String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

    int result = solution.solution(cacheSize, cities);

    assertThat(result).isEqualTo(60);
  }

  @Test
  void testCase4() {
    int cacheSize = 5;
    String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

    int result = solution.solution(cacheSize, cities);

    assertThat(result).isEqualTo(52);
  }

  @Test
  void testCase5() {
    int cacheSize = 2;
    String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};

    int result = solution.solution(cacheSize, cities);

    assertThat(result).isEqualTo(16);
  }

  @Test
  void testCase6() {
    int cacheSize = 0;
    String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

    int result = solution.solution(cacheSize, cities);

    assertThat(result).isEqualTo(25);
  }
}