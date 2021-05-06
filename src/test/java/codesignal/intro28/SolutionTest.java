package codesignal.intro28;

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
        assertThat(solution.alphabeticShift("crazy")).isEqualTo("dsbaz");
    }

    @Test
    void testCase2() {
        assertThat(solution.alphabeticShift("z")).isEqualTo("a");
    }

    @Test
    void testCase3() {
        assertThat(solution.alphabeticShift("aaaabbbccd")).isEqualTo("bbbbcccdde");
    }

    @Test
    void testCase4() {
        assertThat(solution.alphabeticShift("fuzzy")).isEqualTo("gvaaz");
    }

    @Test
    void testCase5() {
        assertThat(solution.alphabeticShift("codesignal")).isEqualTo("dpeftjhobm");
    }
}
