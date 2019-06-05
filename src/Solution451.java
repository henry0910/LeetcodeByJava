import java.util.HashMap;
import java.util.Map;

public class Solution451 {
    public String frequencySort(String s) {
        if (s == null || s.length() == 0) return "";
        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String curr = s.substring(i, i+1);
            if (!myMap.containsKey(curr)) myMap.put(curr, 1);
            else myMap.put(curr, myMap.get(curr) + 1);
        }
        StringBuilder sb = new StringBuilder();
        while (myMap.keySet().size() > 0) {
            String currKey = chooseKey(myMap);
            int value = myMap.get(currKey);
            while (value > 0) {
                sb.append(currKey);
                value --;
            }
            myMap.remove(currKey);
        }
        return sb.toString();

    }
    private String chooseKey(Map<String, Integer> map) {
        String keyWithMostValue = "";
        int max = 0;
        for (String s : map.keySet()) {
            if (map.get(s) > max) {
                max = map.get(s);
                keyWithMostValue = s;
            }
        }
        return keyWithMostValue;
    }
}
