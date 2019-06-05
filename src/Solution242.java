import java.util.HashMap;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<String, Integer> myMap1 = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            String curr = s.substring(i, i+1);
            if (!myMap1.containsKey(curr)) myMap1.put(curr, 1);
            else myMap1.put(curr, myMap1.get(curr) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            String curr = t.substring(i, i+1);
            if (!myMap1.containsKey(curr)) return false;
            else {
                int value = myMap1.get(curr) - 1;
                if (value == 0) myMap1.remove(curr);
                else myMap1.put(curr, value);
            }
        }
        return myMap1.keySet().size() == 0;
    }
}
