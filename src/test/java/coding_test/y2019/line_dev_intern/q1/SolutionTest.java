package coding_test.y2019.line_dev_intern.q1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    public void testCase_1() {
        List<Consumer> consumers = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            consumers.add(new Consumer());
        }

        Queue<Integer> messages = new LinkedList<>();
        messages.add(4);
        messages.add(3);
        messages.add(5);
        messages.add(2);
        messages.add(8);

        assertThat(Solution.solution(consumers, messages)).isEqualTo(14);
    }
}