public class Solution413 {
    int sum = 0;
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3) return 0;
        slices(A, A.length - 1);
        return sum;
    }
    private int slices(int[] A, int length) {
        if (length < 2) return 0;
        int curr = 0;
        if ((A[length] - A[length - 1]) == (A[length - 1] - A[length - 2])) {
            curr = 1 + slices(A, length - 1);
            sum += curr;
        }
        else {
            slices(A, length - 1);
        }
        return curr;
    }
}
