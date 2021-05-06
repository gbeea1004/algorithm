package codesignal.intro29;

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
        assertThat(solution.chessBoardCellColor("A1", "C3")).isTrue();
    }

    @Test
    void testCase2() {
        assertThat(solution.chessBoardCellColor("A1", "H3")).isFalse();
    }

    @Test
    void testCase3() {
        assertThat(solution.chessBoardCellColor("A1", "A2")).isFalse();
    }

    @Test
    void testCase4() {
        assertThat(solution.chessBoardCellColor("A1", "B2")).isTrue();
    }

    @Test
    void testCase5() {
        assertThat(solution.chessBoardCellColor("B3", "H8")).isFalse();
    }

    @Test
    void testCase6() {
        assertThat(solution.chessBoardCellColor("C3", "B5")).isFalse();
    }

    @Test
    void testCase7() {
        assertThat(solution.chessBoardCellColor("G5", "E7")).isTrue();
    }

    @Test
    void testCase8() {
        assertThat(solution.chessBoardCellColor("C8", "H8")).isFalse();
    }

    @Test
    void testCase9() {
        assertThat(solution.chessBoardCellColor("D2", "D2")).isTrue();
    }

    @Test
    void testCase10() {
        assertThat(solution.chessBoardCellColor("A2", "A5")).isFalse();
    }
}
