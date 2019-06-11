public class Solution821 {
    public int[] shortestToChar(String S, char C) {
        int N = S.length();
        int[] res = new int[N];
        int prev = Integer.MIN_VALUE / 2;
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == C) prev = i;
            res[i] = i - prev;
        }
        prev = Integer.MAX_VALUE / 2;
        for (int i = N - 1; i >= 0; --i) {
            if (S.charAt(i) == C) prev = i;
            res[i] = Math.min(res[i], prev - i);
        }
        return res;
    }
}
