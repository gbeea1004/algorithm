package programmers.q258712;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Solution {

  public int solution(String[] friends, String[] gifts) {
    Map<String, Integer> giftHistory = new HashMap<>();
    for (String gift : gifts) {
      if (!giftHistory.containsKey(gift)) {
        giftHistory.put(gift, 1);
        continue;
      }
      giftHistory.put(gift, giftHistory.get(gift) + 1);
    }

    Map<String, Exponent> giftExponents = new HashMap<>();
    for (String name : friends) {
      giftExponents.put(name, new Exponent(0, 0));
    }
    for (String key : giftHistory.keySet()) {
      String[] names = key.split(" ");
      Integer count = giftHistory.get(key);
      String sender = names[0];
      String receiver = names[1];
      Exponent send = giftExponents.get(sender);
      send.sendCount += count;
      giftExponents.put(sender, send);
      Exponent receive = giftExponents.get(receiver);
      receive.receiverCount += count;
      giftExponents.put(receiver, receive);
    }

    int result = 0;
    for (int i = 0; i < friends.length; i++) {
      String name = friends[i];
      int giftCount = 0;
      for (int j = 0; j < friends.length; j++) {
        if (i == j) {
          continue;
        }

        String friendName = friends[j];
        Integer giveCount = Optional.ofNullable(giftHistory.get(name + " " + friendName)).orElse(0);
        Integer receiveCount = Optional.ofNullable(giftHistory.get(friendName + " " + name)).orElse(0);

        if (giveCount > receiveCount) {
          giftCount++;
          continue;
        }

        if (giveCount == receiveCount) {
          int senderExponent = giftExponents.get(name).getGiftExponent();
          int receiverExponent = giftExponents.get(friendName).getGiftExponent();
          if (senderExponent > receiverExponent) {
            giftCount++;
          }
        }
      }

      result = Math.max(result, giftCount);
    }

    return result;
  }

  class Exponent {
    private int sendCount;
    private int receiverCount;

    public Exponent(int sendCount, int receiverCount) {
      this.sendCount = sendCount;
      this.receiverCount = receiverCount;
    }

    public int getGiftExponent() {
      return sendCount - receiverCount;
    }

    @Override
    public String toString() {
      return "sendCount=" + sendCount + ", receiverCount=" + receiverCount;
    }
  }
}
