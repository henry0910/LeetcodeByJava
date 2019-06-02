import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution30 {
    public List<Integer> findSubstring(String s, String[] words) {
        if (s == null || words == null || s.length() == 0 || words.length == 0) return new ArrayList<>();
        int n = words.length;
        int m = words[0].length();
        List<Integer> res = new ArrayList<>();
        Map<String, Integer> myMap = new HashMap<>();
        for (String str : words) {
            myMap.put(str, myMap.getOrDefault(str, 0) + 1);
        }
        for (int i = 0; i <= s.length() - n * m; i++) {
            Map<String, Integer> temp = new HashMap<>(myMap);
            int k = n;
            int j = i;
            while (k > 0) {
                String curr = s.substring(j, j + m);
                if (!temp.containsKey(curr) || temp.get(curr) < 1) {
                    break;
                }
                temp.put(curr, temp.get(curr) - 1);
                k--;
                j += m;
            }
            if (k == 0) res.add(i);
        }
        return res;
    }
}
