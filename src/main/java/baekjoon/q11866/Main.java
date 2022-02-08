package baekjoon.q11866;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bw.write(new Solution().solution(n, k));
        bw.newLine();

        bw.flush();

        bw.close();
        br.close();
    }
}

class Solution {

    public String solution(int n, int k) {
        List<Person> people = createPeople(n);
        int startNo = 0;
        k--;

        List<Integer> removedPersons = play(k, people, startNo);
        return print(removedPersons);
    }

    private List<Person> createPeople(int peopleCount) {
        List<Person> people = new LinkedList<>();
        for (int i = 0; i < peopleCount; i++) {
            people.add(new Person(i + 1));
        }
        return people;
    }

    private List<Integer> play(int k, List<Person> people, int startNo) {
        List<Integer> removedPersons = new ArrayList<>();
        while (!people.isEmpty()) {
            int removeIndex = (startNo + k) % people.size();
            Person findPerson = people.get(removeIndex);

            removedPersons.add(findPerson.id);

            people.remove(removeIndex);
            startNo = removeIndex;
        }
        return removedPersons;
    }

    private String print(List<Integer> removedPersons) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < removedPersons.size(); i++) {
            int removedPerson = removedPersons.get(i);

            if (i == removedPersons.size() - 1) {
                sb.append(removedPerson);
                break;
            }

            sb.append(removedPerson)
              .append(", ");
        }
        sb.append(">");

        return sb.toString();
    }

    class Person {
        private final int id;

        public Person(int id) {
            this.id = id;
        }
    }
}
