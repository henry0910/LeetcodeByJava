import java.util.HashMap;
import java.util.Map;

public class Solution76 {
    // O(n) slide window
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        Map<Character, Integer> wordDict =constructWordDict(t);
        int slow = 0, minLen = Integer.MAX_VALUE, matchCount = 0, index = 0;
        for (int fast = 0; fast < s.length(); fast++) {
            char ch = s.charAt(fast);
            Integer count = wordDict.get(ch);
            if (count == null) continue;
            wordDict.put(ch, count - 1);
            if (count == 1) matchCount++;
            while (matchCount == wordDict.size()) {
                if (fast - slow + 1 < minLen) {
                    minLen = fast - slow + 1;
                    index = slow;
                }
                char leftmost = s.charAt(slow++);
                Integer leftmostCount = wordDict.get(leftmost);
                if (leftmostCount == null) continue;
                wordDict.put(leftmost, leftmostCount + 1);
                if (leftmostCount == 0) matchCount--;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(index, index + minLen);
    }
    private Map<Character, Integer> constructWordDict(String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
    // TLE approach
//    public String minWindow(String s, String t) {
//        if (t == null || t.length() == 0 || s == null || s.length() == 0) return "";
//        if (t.length() > s.length()) return "";
//        Map<Character, Integer> myMap = new HashMap<>();
//        int winSize = t.length();
//        for (char single : t.toCharArray()) {
//            if (!myMap.containsKey(single)) myMap.put(single, 1);
//            else myMap.put(single, myMap.get(single) + 1);
//        }
//        int minLen = Integer.MAX_VALUE;
//        String result = "";
//        int start = 0;
//        while (start + winSize <= s.length()) {
//            int end = start + winSize;
//            while (end <= s.length()) {
//                String curr = s.substring(start, end);
//                if (containsAll(myMap, curr) && curr.length() < minLen) {
//                    result = curr;
//                    minLen = curr.length();
//                }
//                end++;
//            }
//            start++;
//        }
//        return result;
//    }
//    private boolean containsAll(Map<Character, Integer> res, String curr) {
//        HashMap<Character, Integer> temp = new HashMap<>(res);
//        for (char s : curr.toCharArray()) {
//            if (temp.containsKey(s)) {
//                if (temp.get(s) > 1) temp.put(s, temp.get(s) - 1);
//                else temp.remove(s);
//            }
//        }
//        return temp.keySet().size() == 0;
//    }


}
