package coding_test.y2019.kakao_blind2020.q2;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testCase_1() {
        assertThat(solution.solution("(()())()")).isEqualTo("(()())()");
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(")(")).isEqualTo("()");
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution("()))((()")).isEqualTo("()(())()");
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution("))((")).isEqualTo("()()");
    }

    @Test
    public void testCase_5() {
        assertThat(solution.solution("()()))((")).isEqualTo("()()()()");
    }

    @Test
    public void testCase_6() {
        assertThat(solution.solution("()()()")).isEqualTo("()()()");
    }
}