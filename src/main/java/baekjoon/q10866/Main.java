package baekjoon.q10866;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        Deque deque = new Deque();
        for (int i = 0; i < count; i++) {
            String command = br.readLine();
            if (command.split(" ").length == 1) {
                switch (command) {
                    case "size":
                        bw.write(String.valueOf(deque.size()));
                        bw.newLine();
                        break;
                    case "empty":
                        bw.write(String.valueOf(deque.empty()));
                        bw.newLine();
                        break;
                    case "front":
                        bw.write(String.valueOf(deque.front()));
                        bw.newLine();
                        break;
                    case "back":
                        bw.write(String.valueOf(deque.back()));
                        bw.newLine();
                        break;
                    case "pop_front":
                        bw.write(String.valueOf(deque.pop_front()));
                        bw.newLine();
                        break;
                    case "pop_back":
                        bw.write(String.valueOf(deque.pop_back()));
                        bw.newLine();
                        break;
                }
            } else {
                String[] commands = command.split(" ");
                if (commands[0].equals("push_front")) {
                    deque.push_front(Integer.parseInt(commands[1]));
                } else if (commands[0].equals("push_back")) {
                    deque.push_back(Integer.parseInt(commands[1]));
                }
            }
        }
        bw.flush();
    }
}

class Deque implements Queue {
    private List<Integer> arr = new ArrayList<>();

    @Override
    public void push_front(int no) {
        arr.add(0, no);
    }

    @Override
    public void push_back(int no) {
        arr.add(no);
    }

    @Override
    public int pop_front() {
        if (arr.size() == 0) {
            return -1;
        }
        int frontNo = arr.get(0);
        arr.remove(0);
        return frontNo;
    }

    @Override
    public int pop_back() {
        if (arr.size() == 0) {
            return -1;
        }
        int lastNo = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        return lastNo;
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public int empty() {
        if (arr.size() == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public int front() {
        if (arr.size() == 0) {
            return -1;
        }
        return arr.get(0);
    }

    @Override
    public int back() {
        if (arr.size() == 0) {
            return -1;
        }
        return arr.get(arr.size() - 1);
    }
}

interface Queue {
    void push_front(int no);

    void push_back(int no);

    int pop_front();

    int pop_back();

    int size();

    int empty();

    int front();

    int back();
}
