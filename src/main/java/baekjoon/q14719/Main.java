package baekjoon.q14719;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        int[] blocks = Arrays.stream(br.readLine().split(" "))
                             .mapToInt(Integer::parseInt)
                             .toArray();

        bw.write(String.valueOf(new Solution().solution(blocks)));
        bw.newLine();

        bw.flush();

        bw.close();
        br.close();
    }
}

class Solution {
    public int solution(int[] blocks) {
        int totalAmountOfRain = 0;

        for (int i = 1; i < blocks.length - 1; i++) {
            int leftHighestBlock = getLeftHighestBlock(blocks, i);
            int rightHighestBlock = getRightHighestBlock(blocks, i);

            totalAmountOfRain = addRainOfCurrentBlock(blocks, totalAmountOfRain, i, leftHighestBlock, rightHighestBlock);
        }

        return totalAmountOfRain;
    }

    private int getLeftHighestBlock(int[] blocks, int currentIndex) {
        int leftHighestBlock = 0;
        for (int i = 0; i < currentIndex; i++) {
            leftHighestBlock = Math.max(leftHighestBlock, blocks[i]);
        }
        return leftHighestBlock;
    }

    private int getRightHighestBlock(int[] blocks, int currentIndex) {
        int rightHighestBlock = 0;
        for (int i = currentIndex + 1; i < blocks.length; i++) {
            rightHighestBlock = Math.max(rightHighestBlock, blocks[i]);
        }
        return rightHighestBlock;
    }

    private int addRainOfCurrentBlock(int[] blocks, int totalAmountOfRain, int currentIndex, int leftHighestBlock, int rightHighestBlock) {
        int currentBlock = blocks[currentIndex];
        if (currentBlock < leftHighestBlock && currentBlock < rightHighestBlock) {
            totalAmountOfRain += Math.min(leftHighestBlock, rightHighestBlock) - blocks[currentIndex];
        }
        return totalAmountOfRain;
    }
}
