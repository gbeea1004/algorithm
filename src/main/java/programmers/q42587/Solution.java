package programmers.q42587;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int solution(int[] priorities, int location) {
        Queue<Print> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Print(priorities[i], i));
        }

        int answer = 1;
        while (true) {
            Print print = queue.poll();
            if (isPrintable(queue, print)) {
                if (print.getIndex() == location) {
                    break;
                }
                answer++;
                continue;
            }
            queue.add(print);
        }
        return answer;
    }

    private boolean isPrintable(Queue<Print> queue, Print target) {
        return queue.stream()
                    .noneMatch(p -> p.getNumber() > target.getNumber());
    }
}

class Print {
    private Integer number;
    private Integer index;

    public Print(Integer number, Integer index) {
        this.number = number;
        this.index = index;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getIndex() {
        return index;
    }
}
