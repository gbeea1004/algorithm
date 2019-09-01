package coding_test.y2019.tmon.controller;

import coding_test.y2019.tmon.domain.CleaningStaff;
import coding_test.y2019.tmon.domain.Cook;
import coding_test.y2019.tmon.domain.Customer;
import coding_test.y2019.tmon.domain.Table;
import coding_test.y2019.tmon.view.InputView;
import coding_test.y2019.tmon.view.ResultView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OpenRestaurant {
    public static void run() {
        int measurementTime = InputView.measurementTime();
        int customerIncomingTime = 0;
        int countOfCook = InputView.countOfCook();
        int countOfCleaningStaff = InputView.countOfCleaningStaff();

        Queue<Customer> waitRoom = new LinkedList<>();
        List<Cook> cooks = new ArrayList<>();
        List<CleaningStaff> cleaningStaffs = new ArrayList<>();

        Table table = new Table(InputView.countOfTable());
        addCooks(countOfCook, cooks);
        addCleaningStaffs(countOfCleaningStaff, cleaningStaffs);

        while (measurementTime > 0) {
            measurementTime--; // 측정 시간
            customerIncomingTime++; // 손님 들어오는 시간

            waitingRoom(waitRoom); // 웨이팅
            sitTable(table); // 착석
            customerIncomingTime = customerIncoming(customerIncomingTime, waitRoom); // 손님 입장


            // 자리가 있을경우 착석
            while (table.isSeat()) {
                // 대기 인원이 없을 경우
                if (waitRoom.isEmpty()) {
                    break;
                }
                table.sitCustomer(waitRoom.poll());
                makeCook(cooks, table);

            }

            // 청소
            cleaning(cleaningStaffs, table);
        }

        ResultView.visitCount(table.getCountOfEatenFoodPeople());
    }

    private static void cleaning(List<CleaningStaff> cleaningStaffs, Table table) {
        // 다 먹은 손님이 있을 경우
        for (Customer sitPerson : table.getSitPersons()) {
            if (sitPerson.isFinishEat()) {
                // Table 객체를 하나하나 만들어야 하나?
                for (CleaningStaff cleaningStaff : cleaningStaffs) {
                    // TODO : 청소할 Table 대상 지정
                    if (!cleaningStaff.isFinish()) {
                        cleaningStaff.work();
                    }
                }
            }
        }
    }

    private static void makeCook(List<Cook> cooks, Table table) {
        // 요리사가 일을 하고 있는가?
        for (Cook cook : cooks) {
            if (!cook.isWorking()) {
                cook.work();
                continue;
            }
            // 요리가 완성
            if (cook.makeFood()) {
                table.getSitPersons().peek().givenFood(); // 요리를 건내준다
            }
        }
    }

    private static void addCleaningStaffs(int countOfCleaningStaff, List<CleaningStaff> cleaningStaffs) {
        for (int i = 0; i < countOfCleaningStaff; i++) {
            cleaningStaffs.add(new CleaningStaff());
        }
    }

    private static int customerIncoming(int customerIncomingTime, Queue<Customer> waitRoom) {
        // 10초 마다
        if (customerIncomingTime == 10) {
            // 7명 입장
            for (int i = 0; i < 7; i++) {
                waitRoom.add(new Customer());
            }
            customerIncomingTime = 0;
        }
        return customerIncomingTime;
    }

    private static void sitTable(Table table) {
        if (!table.getSitPersons().isEmpty()) {
            for (Customer sitCustomer : table.getSitPersons()) {
                if (sitCustomer.isFinishEat()) {
                    table.getSitPersons().poll();
                }
                sitCustomer.eaitting();
            }
        }
    }

    private static void waitingRoom(Queue<Customer> waitRoom) {
        if (!waitRoom.isEmpty()) {
            for (Customer customer : waitRoom) {
                if (customer.isOverWait()) { // 맨 앞에 것보다 더 기다리는 경우는 없음
                    waitRoom.poll();
                }
                customer.waiting();
            }
        }
    }

    private static void addCooks(int countOfCook, List<Cook> cooks) {
        for (int i = 0; i < countOfCook; i++) {
            cooks.add(new Cook());
        }
    }
}
