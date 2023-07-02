package programmers.q178871;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public String[] solution(String[] players, String[] callings) {
    Map<String, Integer> playerMap = getPlayerMap(players);
    for (int i = 0; i < callings.length; i++) {
      String outrunPlayerName = callings[i];
      int index = playerMap.get(outrunPlayerName);
      playerMap.put(outrunPlayerName, index - 1);
      String player = players[index - 1];
      playerMap.put(player, playerMap.get(player) + 1);

      String temp = players[index];
      players[index] = players[index - 1];
      players[index - 1] = temp;
    }

    return players;
  }

  private Map<String, Integer> getPlayerMap(String[] players) {
    Map<String, Integer> playerMap = new HashMap<>();
    for (int i = 0; i < players.length; i++) {
      playerMap.put(players[i], i);
    }

    return playerMap;
  }
}
