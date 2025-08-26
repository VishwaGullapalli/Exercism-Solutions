import java.util.*;

class SumOfMultiples {

    private Set<Integer> multiples = new HashSet<>();
    SumOfMultiples(int number, int[] set) {
        for (int i = 0; i < set.length; i++) {
            if (set[i] == 0) {
                continue;
            }
            for (int j = 1; j < number; j = j + set[i]) {
                int element = set[i] + j - 1;
                if (element < number) {
                    multiples.add(element);
                }
            }
        }
    }

    int getSum() {
        return multiples.stream().mapToInt(Integer::intValue).sum();
    }

}
