package baekjoon.q8979;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Country> countrys = new ArrayList<>();
        int rank = 1;

        for (int i = 0; i < input[0]; i++) {
            int[] medals = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Country country = new Country();
            for (int medal : medals) {
                country.add(medal);
            }
            countrys.add(country);
        }

        countrys.sort(new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                if (o1.getMedal().get(1) > o2.getMedal().get(1)) {
                    return -1;
                } else if (o1.getMedal().get(1).equals(o2.getMedal().get(1))) {
                    if (o1.getMedal().get(2) > o2.getMedal().get(2)) {
                        return -1;
                    } else if (o1.getMedal().get(2).equals(o2.getMedal().get(2))) {
                        if (o1.getMedal().get(3) > o2.getMedal().get(3)) {
                            return -1;
                        }
                    }
                }
                return 1;
            }
        });

        for (int i = 0; i < countrys.size(); i++) {
            if (input[1] == countrys.get(i).getMedal().get(0)) {
                if (i == 0) {
                    System.out.println(1);
                    break;
                }
                Country country = countrys.get(i);
                int overlab = 0;
                for (int j = 0; j < i; j++) {
                    if (countrys.get(j).isSame(country)) {
                        overlab++;
                    }
                }
                System.out.println(i + 1 - overlab);
                break;
            }
        }

        scanner.close();
    }
}

class Country {
    private List<Integer> medal = new ArrayList<>();

    public void add(int no) {
        medal.add(no);
    }

    public List<Integer> getMedal() {
        return medal;
    }

    boolean isSame(Country country) {
        return medal.get(1).equals(country.getMedal().get(1)) &&
                medal.get(2).equals(country.getMedal().get(2)) &&
                medal.get(3).equals(country.getMedal().get(3));
    }
}
