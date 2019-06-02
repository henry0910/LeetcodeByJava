public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int pos = -1, curr = 0, total = 0;
        for (int i = 0; i < gas.length; ++i) {
            int diff = gas[i] - cost[i];
            curr += diff;
            total += diff;
            if (curr < 0) {
                curr = 0;
                pos = i;
            }
        }
        return total >= 0 ? pos + 1 : -1;
//        for (int i = 0; i < gas.length; ++i) {
//            int currSum = 0;
//            if (gas[i] - cost[i] >= 0) {
//                currSum += gas[i];
//                for (int j = i + 1; j < gas.length; ++j) {
//                    currSum -= cost[j-1];
//                    if (currSum < 0) break;
//                    else currSum += gas[j];
//
//                }
//                if (currSum >= 0) {
//                    for (int j = 0; j <= i; ++j) {
//                        if (j == 0) {
//                            currSum -= cost[cost.length - 1];
//                        }
//                        else currSum -= cost[j-1];
//                        if (currSum < 0) break;
//                        else currSum += gas[j];
//                    }
//                }
//                if (currSum >= 0) return i;
//            }
//        }
//        return -1;
    }
}
