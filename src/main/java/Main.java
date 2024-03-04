import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int count = 0;
        int even = -1;
        for (Integer i : map.keySet()) {
            if (i % 2 == 0 && map.get(i)>count) {
                even = i;
                count = map.get(i);
            }
        }

        return even;
    }
}
