package programmers.q17680;


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
        assertThat(solution.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork",
                "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" }))
                .isEqualTo(50);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju",
                "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul" }))
                .isEqualTo(21);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA",
                "SanFrancisco", "Seoul", "Rom", "Paris", "Jeju", "NewYork", "Rome" }))
                .isEqualTo(60);
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork",
                "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome" }))
                .isEqualTo(52);
    }

    @Test
    public void testCase_5() {
        assertThat(solution.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork" }))
                .isEqualTo(16);
    }

    @Test
    public void testCase_6() {
        assertThat(solution.solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA" }))
                .isEqualTo(25);
    }
}