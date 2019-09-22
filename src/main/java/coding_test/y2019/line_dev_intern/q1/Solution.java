package coding_test.y2019.line_dev_intern.q1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfMessage = sc.nextInt();
        int countOfConsumer = sc.nextInt();
        Queue<Integer> messages = new LinkedList<>();
        List<Consumer> consumers = new ArrayList<>();

        for (int i = 0; i < countOfMessage; i++) {
            messages.add(sc.nextInt());
        }

        for (int i = 0; i < countOfConsumer; i++) {
            consumers.add(new Consumer());

        }
        System.out.println(solution(consumers, messages));
    }

    public static int solution(List<Consumer> consumers, Queue<Integer> messages) {
        int time = 0;
        while (!messages.isEmpty() || consumers.stream().filter(c -> !c.isWaiting()).count() >= 1) {
            time++;
            for (Consumer consumer : consumers) {
                if (consumer.isWaiting()) {
                    if (messages.peek() != null) {
                        consumer.addTarget(messages.poll());
                    }
                }
                consumer.process();
            }
        }
        return time;
    }
}

class Consumer {
    private int targetProcessingTime;
    private int currentTime;

    public Consumer() {
        this.targetProcessingTime = -1; // wait 상태 : -1
        this.currentTime = 1;
    }

    public boolean isWaiting() {
        return targetProcessingTime == -1;
    }

    public void addTarget(int messageProcessingTime) {
        targetProcessingTime = messageProcessingTime;
    }

    public void process() {
        if (targetProcessingTime == currentTime) {
            targetProcessingTime = -1;
            currentTime = 1;
            return;
        }
        currentTime++;
    }
}
