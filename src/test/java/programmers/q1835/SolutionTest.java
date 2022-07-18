package programmers.q1835;

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
        assertThat(solution.solution(2, new String[]{"N~F=0", "R~T>2"})).isEqualTo(3648);
    }

    @Test
    void testCase2() {
        assertThat(solution.solution(2, new String[]{"M~C<2", "C~M>1"})).isEqualTo(0);
    }
}