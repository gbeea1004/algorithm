package programmers.q17680;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private final int CACHE_HIT = 1;
    private final int CACHE_MISS = 5;

    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * CACHE_MISS;
        }

        Queue<String> cache = new LinkedList<>();
        int answer = 0;

        for (String city : cities) {
            if (!cache.isEmpty()) {
                boolean isCache = false;
                for (String cachedCity : cache) {
                    if (cachedCity.equalsIgnoreCase(city)) {
                        isCache = true;
                        break;
                    }
                }

                if (isCache) {
                    cache.remove(city.toLowerCase());
                    cache.add(city.toLowerCase());
                    answer += CACHE_HIT;
                } else {
                    if (cache.size() == cacheSize) {
                        cache.poll();
                    }
                    cache.add(city.toLowerCase());
                    answer += CACHE_MISS;
                }
                continue;
            }
            cache.add(city.toLowerCase());
            answer += CACHE_MISS;
        }
        return answer;
    }
}
