package programmers.q60058;

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
        assertThat(solution.solution("()")).isEqualTo("()");
    }

    @Test
    public void 쪼갤수있는_문자열이_잘_분리됬는가() {
        // given
        String p = "))((()";

        // when
        int endIndex = solution.endIndex(p);

        // then
        assertThat(p.substring(0, endIndex)).isEqualTo("))((");
        assertThat(p.substring(endIndex)).isEqualTo("()");
    }

    @Test
    public void 쪼갤수없는_문자열이_잘_분리됬는가() {
        // given
        String p = ")(";

        // when
        int endIndex = solution.endIndex(p);

        // then
        assertThat(p.substring(0, endIndex)).isEqualTo(")(");
        assertThat(p.substring(endIndex)).isEqualTo("");
    }
}