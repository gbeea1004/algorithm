package programmers.q42583;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> wait = new LinkedList<>();
        for (int truckWeight : truck_weights) {
            wait.add(new Truck(truckWeight));
        }
        Queue<Truck> bridge = new LinkedList<>();
        int bridgeWeight = 0;

        int time = 0;
        while (!wait.isEmpty() || !bridge.isEmpty()) {
            time++;

            // 도달했는가
            if (!bridge.isEmpty() && bridge.peek().getDistance() == bridge_length) {
                Truck truck = bridge.poll();
                bridgeWeight -= truck.getWeight();
            }

            // 트럭 진입
            if (!wait.isEmpty() && bridgeWeight + wait.peek().getWeight() <= weight) {
                Truck truck = wait.poll();
                bridge.add(truck);
                bridgeWeight += truck.getWeight();
            }

            // move
            for (Truck truck : bridge) {
                truck.move();
            }
        }

        return time;
    }

    private static class Truck {

        private final int weight;
        private int distance;

        public Truck(int weight) {
            this.distance = 0;
            this.weight = weight;
        }

        public void move() {
            distance++;
        }

        public int getDistance() {
            return distance;
        }

        public int getWeight() {
            return weight;
        }
    }
}
