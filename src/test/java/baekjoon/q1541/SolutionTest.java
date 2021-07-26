package baekjoon.q1541;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    @Test
    public void textCase1() {
        assertThat(Solution.solution("1+1+1-1")).isEqualTo(2);
    }

    @Test
    public void textCase2() {
        assertThat(Solution.solution("55-50+40")).isEqualTo(-35);
    }

    @Test
    public void textCase3() {
        assertThat(Solution.solution("2")).isEqualTo(2);
    }

    @Test
    public void textCase4() {
        assertThat(Solution.solution("0-2+2")).isEqualTo(-4);
    }
}