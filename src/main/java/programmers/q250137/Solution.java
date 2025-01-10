package programmers.q250137;

public class Solution {

    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentTime = 0;
        int finalTime = attacks[attacks.length - 1][0];
        int skillChargingTime = 0;
        int monsterRound = 0;
        int maxHealth = health;

        while (++currentTime <= finalTime) {
            int monsterAttackTime = attacks[monsterRound][0];
            if (currentTime == monsterAttackTime) {
                health -= attacks[monsterRound++][1];
                skillChargingTime = 0;

                if (health <= 0) {
                    return -1;
                }

                continue;
            }

            skillChargingTime++;
            health = heal(bandage[1], health, maxHealth);
            if (skillChargingTime == bandage[0]) {
                health = heal(bandage[2], health, maxHealth);
                skillChargingTime = 0;
            }
        }

        return health;
    }

    private int heal(int healAmount, int health, int maxHealth) {
        if (health >= maxHealth) {
            return health;
        }

        health += Math.min(maxHealth - health, healAmount);
        return health;
    }
}
