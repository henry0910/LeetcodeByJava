import java.util.HashSet;
import java.util.Set;


enum index {
    GOOD, BAD, UNKNOWN
}
public class Solution55 {
    // linear search approach
//    public boolean canJump(int[] nums) {
//        int max=0;
//        int i=0;
//        while(max<nums.length-1){
//            if(i>max) return false;
//            max=Math.max(max, i+nums[i]);
//            i++;
//        }
//        return true;
//    }
    // dynamic programming
    public boolean canJump(int[] nums) {
        index[] memo = new index[nums.length];
        for (int i = 0; i < memo.length; ++i) memo[i] = index.UNKNOWN;
        memo[memo.length - 1] = index.GOOD;
        for (int i = nums.length - 2; i >= 0; --i) {
            int furthest = Math.min(i + nums[i], nums.length - 1);
            for (int j = i + 1; j <= furthest; ++j) {
                if (memo[j] == index.GOOD) {
                    memo[i] = index.GOOD;
                    break;
                }
            }
        }
        return memo[0] == index.GOOD;
    }
    // backtracking
//    public boolean canJump(int[] nums) {
//        return backtracking(0, nums);
//    }
//    private boolean backtracking(int position, int[] nums) {
//        if (position == nums.length - 1) return true;
//        int furthestJump = Math.min(position + nums[position], nums.length - 1);
//        for (int next = furthestJump; next > position; --next) {
//            if (backtracking(next, nums)) return true;
//        }
//        return false;
//    }
}
