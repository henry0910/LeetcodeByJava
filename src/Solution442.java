import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution442 {
    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (Integer i : nums) {
            if (!dict.containsKey(i)) dict.put(i, 1);
            else res.add(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
}
