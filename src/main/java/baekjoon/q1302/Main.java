package baekjoon.q1302;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> sellBooks = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String book = scanner.nextLine();
            if (!sellBooks.containsKey(book)) {
                sellBooks.put(book, 1);
                continue;
            }
            sellBooks.put(book, sellBooks.get(book) + 1);
        }

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(sellBooks.entrySet());
        entryList.sort((o1, o2) -> {
            int value = o2.getValue() - o1.getValue();
            if (value == 0) {
                return o1.getKey().compareTo(o2.getKey());
            }
            return value;
        });

        System.out.println(entryList.get(0).getKey());

        scanner.close();
    }
}
