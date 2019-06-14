import java.util.Comparator;

public class LexicoComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        String s1 = String.valueOf(o1);
        String s2 = String.valueOf(o2);
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < s1.length() && idx2 < s2.length()) {
            if (s1.charAt(idx1++) -  s2.charAt(idx2++) > 0) {
                return 1;
            }
            else {
                return -1;
            }
        }
        if (s1.length() > s2.length()) return 1;
        else return -1;
    }
}
