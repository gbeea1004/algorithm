package programmers.q92334;

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
    void testCase_1() {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        assertThat(solution.solution(id_list, report, 2)).isEqualTo(new int[]{2, 1, 1, 0});
    }

    @Test
    void testCase_2() {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};

        assertThat(solution.solution(id_list, report, 3)).isEqualTo(new int[]{0, 0});
    }
}