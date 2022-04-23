package programmers.q42889;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void tesCase1() {
        assertThat(solution.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})).isEqualTo(new int[]{3, 4, 2, 1, 5});
    }

    @Test
    void tesCase2() {
        assertThat(solution.solution(4, new int[]{4, 4, 4, 4, 4})).isEqualTo(new int[]{4, 1, 2, 3});
    }

    @Test
    void tesCase3() {
        assertThat(solution.solution(3, new int[]{1, 1, 1})).isEqualTo(new int[]{1, 2, 3});
    }

    @Test
    void tesCase4() {
        System.out.println(0 / 2);
        assertThat(solution.solution(5, new int[]{2, 2, 2, 2, 2})).isEqualTo(new int[]{2, 1, 3, 4, 5});
    }
}