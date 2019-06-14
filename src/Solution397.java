import java.util.HashMap;
import java.util.Map;

public class Solution397 {
    private static Map<Integer, Integer> cnt = new HashMap<>();
    public int integerReplacement(int n) {
        if (cnt.containsKey(n)) return cnt.get(n);

        if (n <= 1) { cnt.put(n, 0); return 0; }

        int counts = 0;
        if (n % 2 == 0) counts = 1 + integerReplacement(n >> 1);
        else            counts = 1 + Math.min(1 + integerReplacement((int)(((long)n + 1) >> 1)), integerReplacement(n - 1));

        cnt.put(n, counts);
        return counts;

    }
}
