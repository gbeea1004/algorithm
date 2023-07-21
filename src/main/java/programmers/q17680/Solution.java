package programmers.q17680;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {

  public static final int CACHE_HIT_TIME = 1;
  public static final int CACHE_MISS_TIME = 5;


  public int solution(int cacheSize, String[] cities) {
    int answer = 0;
    Set<String> cache = new LinkedHashSet<>(cacheSize);
    for (String city : cities) {
      city = city.toUpperCase();
      if (cache.contains(city)) {
        cache.remove(city);
        cache.add(city);
        answer += CACHE_HIT_TIME;
        continue;
      }

      if (cacheSize != 0) {
        if (cache.size() == cacheSize) {
          cache.remove(cache.stream().findFirst().get());
        }

        cache.add(city);
      }
      answer += CACHE_MISS_TIME;
    }

    return answer;
  }
}
