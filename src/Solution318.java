import java.util.ArrayList;
import java.util.List;

public class Solution318 {
    public int maxProduct(String[] words) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < words.length - 1; ++i) {
            for (int j = i+1; j < words.length; ++j) {
                if (!containsLetter(words[i], words[j])) temp.add(words[i].length()*words[j].length());
            }
        }
        if (temp.size() == 0) return 0;
        int maxProduct = temp.get(0);
        for (Integer i : temp) {
            if (i > maxProduct) maxProduct = i;
        }
        return maxProduct;
    }
    private boolean containsLetter(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) return false;
        for (int i = 0; i < s1.length(); ++i) {
            if (s2.contains(s1.substring(i, i+1))) return true;
        }
        return false;
    }
}
