import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution389 {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); ++i) {
            if (!map.containsKey(t.charAt(i))) return t.charAt(i);
            else {
                int currValue = map.get(t.charAt(i));
                if (currValue == 1) {
                    map.remove(t.charAt(i));
                }
                else map.put(t.charAt(i), currValue - 1);
            }
        }
        return ' ';
    }
}
