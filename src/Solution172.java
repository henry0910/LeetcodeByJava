public class Solution172 {
    public static int trailingZeroes(int n) {
        return n>=5 ? n/5 + trailingZeroes(n/5): 0;
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println(trailingZeroes(n));
    }
}
