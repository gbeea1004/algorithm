package codesignal.intro13;


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
        assertThat(solution.reverseInParentheses("foo(bar(baz))blim"))
                .isEqualTo("foobazrabblim");
    }
}
