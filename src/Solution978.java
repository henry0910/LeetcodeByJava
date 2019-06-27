public class Solution978 {
    public int maxTurbulenceSize(int[] A) {
        int n = A.length;
        if(n == 0) return 0;
        int vally = 1, peek = 1, maxlen = 1;
        for(int i=1; i<n; i++){
            int lastVally = vally, lastPeek = peek;
            vally = A[i] < A[i-1] ? lastPeek + 1 : 1;
            peek = A[i] > A[i-1] ? lastVally + 1 : 1;
            maxlen = Math.max(maxlen, Math.max(vally, peek));
        }
        return maxlen;
    }
}
