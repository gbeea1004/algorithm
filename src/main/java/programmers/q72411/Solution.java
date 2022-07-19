package programmers.q72411;

import java.util.*;

public class Solution {

    private List<String> result = new ArrayList<>();
    private Map<String, Integer> comDishes = new HashMap<>();

    public String[] solution(String[] orders, int[] course) {
        sort(orders);

        for (int courseSize : course) {
            for (String order : orders) {
                dfs("", order, courseSize);
            }

            if (!comDishes.isEmpty()) {
                List<Integer> counts = new ArrayList<>(comDishes.values());
                int maxOrderCount = Collections.max(counts);
                if (maxOrderCount >= 2) {
                    for (String key : comDishes.keySet()) {
                        if (comDishes.get(key) == maxOrderCount) {
                            result.add(key);
                        }
                    }
                }
                comDishes.clear();
            }
        }

        Collections.sort(result);
        return result.toArray(new String[0]);
    }

    private void dfs(String dishes, String order, int courseSize) {
        if (dishes.length() == courseSize) {
            comDishes.put(dishes, comDishes.getOrDefault(dishes, 0) + 1);
            return;
        }

        for (int i = 0; i < order.length(); i++) {
            dfs(dishes + order.charAt(i), order.substring(i + 1), courseSize);
        }
    }

    private void sort(String[] orders) {
        for (int i = 0; i < orders.length; i++) {
            char[] toCharOrders = orders[i].toCharArray();
            Arrays.sort(toCharOrders);
            orders[i] = String.valueOf(toCharOrders);
        }
    }
}
