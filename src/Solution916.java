import java.util.ArrayList;
import java.util.List;

public class Solution916 {
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> res = new ArrayList<>();
        int i;
        StringBuilder sb = new StringBuilder();
        for (String s : B) sb.append(s);
        String concat = sb.toString();
        int[] counter_b = counter(concat);
        for (String a : A) {
            int[] temp = counter(a);
            for (i = 0; i < 26; ++i) {
                if (temp[i] < counter_b[i]) {
                    break;
                }
            }
            if (i == 26) res.add(a);
        }
        return res;
    }
    private int[] counter(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) count[c - 'a'] ++ ;
        return count;
    }
}
