package coding_test.groundx.day_20190521.q2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    public void testCase_1() {
        Solution solution = new Solution();
        assertThat(solution.solution("3(hi)")).isEqualTo("hihihi");
    }

    @Test
    public void testCase_2() {
        Solution solution = new Solution();
        assertThat(solution.solution("2(3(hi)co)")).isEqualTo("hihihicohihihico");
    }

    @Test
    public void testCase_3() {
        Solution solution = new Solution();
        assertThat(solution.solution("10(p)")).isEqualTo("pppppppppp");
    }

    @Test
    public void testCase_4() {
        Solution solution = new Solution();
        assertThat(solution.solution("2(2(hi)2(co))x2(bo)")).isEqualTo("hihicocohihicocoxbobo");
    }
}