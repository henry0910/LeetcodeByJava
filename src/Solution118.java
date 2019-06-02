import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return list;
        }
        List<Integer> firstList = new ArrayList<Integer>();
        firstList.add(1);
        list.add(firstList);
        for (int i = 1; i < numRows; i++) {
            List<Integer> subList = new ArrayList<Integer>();
            subList.add(1);
            List<Integer> previous = list.get(i - 1);
            if (i >= 2) {
                for (int j = 1; j < i; j++) {
                    int num = previous.get(j - 1) + previous.get(j);
                    subList.add(num);
                }
            }
            subList.add(1);
            list.add(subList);
        }
        return list;
    }
}
