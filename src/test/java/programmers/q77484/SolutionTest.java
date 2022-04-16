package programmers.q77484;

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
    void testCase1() {
        int[] lottos = new int[]{44, 1, 0, 0, 31, 25};
        int[] win_nums = new int[]{31, 10, 45, 1, 6, 19};

        assertThat(solution.solution(lottos, win_nums)).isEqualTo(new int[]{3, 5});
    }

    @Test
    void testCase2() {
        int[] lottos = new int[]{0, 0, 0, 0, 0, 0};
        int[] win_nums = new int[]{38, 19, 20, 40, 15, 25};

        assertThat(solution.solution(lottos, win_nums)).isEqualTo(new int[]{1, 6});
    }

    @Test
    void testCase3() {
        int[] lottos = new int[]{45, 4, 35, 20, 3, 9};
        int[] win_nums = new int[]{20, 9, 3, 45, 4, 35};

        assertThat(solution.solution(lottos, win_nums)).isEqualTo(new int[]{1, 1});
    }
}