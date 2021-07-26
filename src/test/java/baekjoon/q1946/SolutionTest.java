package baekjoon.q1946;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private List<employer> employers;

    @BeforeEach
    public void setUp() throws Exception {
        employers = new ArrayList<>();
    }

    @Test
    public void testCase_1() {
        employers.add(new employer(3, 2));
        employers.add(new employer(1, 4));
        employers.add(new employer(4, 1));
        employers.add(new employer(2, 3));
        employers.add(new employer(5, 5));

        assertThat(Solution.solution(employers)).isEqualTo(4);
    }

    @Test
    public void testCase_2() {
        employers.add(new employer(3, 6));
        employers.add(new employer(7, 3));
        employers.add(new employer(4, 2));
        employers.add(new employer(1, 4));
        employers.add(new employer(5, 7));
        employers.add(new employer(2, 5));
        employers.add(new employer(6, 1));

        assertThat(Solution.solution(employers)).isEqualTo(3);
    }

    @Test
    public void testCase_3() {
        employers.add(new employer(1, 1));
        employers.add(new employer(2, 4));
        employers.add(new employer(3, 2));
        employers.add(new employer(4, 3));

        assertThat(Solution.solution(employers)).isEqualTo(1);
    }

    @Test
    public void testCase_4() {
        employers.add(new employer(6, 4));
        employers.add(new employer(4, 1));
        employers.add(new employer(5, 2));
        employers.add(new employer(1, 6));
        employers.add(new employer(2, 3));
        employers.add(new employer(3, 5));

        assertThat(Solution.solution(employers)).isEqualTo(3);
    }
}