package programmers.q176963;

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
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        int[] result = solution.solution(name, yearning, photo);

        assertThat(result).isEqualTo(new int[]{19, 15, 6});
    }

    @Test
    void testCase2() {
        String[] name = {"kali", "mari", "don"};
        int[] yearning = {11, 1, 55};
        String[][] photo = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};

        int[] result = solution.solution(name, yearning, photo);

        assertThat(result).isEqualTo(new int[]{67, 0, 55});
    }

    @Test
    void testCase3() {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};

        int[] result = solution.solution(name, yearning, photo);

        assertThat(result).isEqualTo(new int[]{5, 15, 0});
    }
}