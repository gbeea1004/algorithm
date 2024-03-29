package coding_test.y2020.est.q4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testCase_1() {
        String text = "John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker;" +
                      " john Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
        assertThat(solution.solution(text, "Example")).isEqualTo("zz");
    }
}