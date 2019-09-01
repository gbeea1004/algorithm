package coding_test.y2019.tmon.domain;

import java.util.LinkedList;
import java.util.Queue;

public class Table {
    private int count; // 자리 수
    private int countOfEatenFoodPeople; // 먹고 나간 사람 수
    private Queue<Customer> sitPersons = new LinkedList<>();

    public Table(int count) {
        this.count = count;
    }

    // 사람이 빠진다.
    public void outCustomer() {
        sitPersons.poll();
        count++;
        countOfEatenFoodPeople++;
    }

    // 사람이 들어옴.
    public void sitCustomer(Customer customer) {
        sitPersons.add(customer);
        count--;
    }

    public boolean isSeat() {
        if (count > 0) {
            return true;
        }
        return false;
    }

    public int getCountOfEatenFoodPeople() {
        return countOfEatenFoodPeople;
    }

    public Queue<Customer> getSitPersons() {
        return sitPersons;
    }
}
