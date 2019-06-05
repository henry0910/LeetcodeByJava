public class Solution5 {
    // Dynamic Programming
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return "";
        }
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int start = 0;
        int end = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j <= i; j++) {
                if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j+1][i-1])) {
                    dp[j][i] = true;
                }
                if(dp[j][i] && max < i - j + 1) {
                    max = i - j + 1;
                    start = j;
                    end = i;
                }
            }
        }
        return s.substring(start, end + 1);
    }
    // Expand Around Center Mock
//    public String longestPalindrome(String s) {
//        int n = s.length();
//        if (n == 0) return "";
//        String longest = s.substring(0, 1);  // a single char itself is a palindrome
//        for (int i = 0; i < n - 1; i++) {
//            String p1 = expandAroundCenter(s, i, i);
//            if (p1.length() > longest.length())
//                longest = p1;
//
//            String p2 = expandAroundCenter(s, i, i+1);
//            if (p2.length() > longest.length())
//                longest = p2;
//        }
//        return longest;
//    }
//
//
//
//    public String expandAroundCenter(String s, int c1, int c2) {
//        int l = c1, r = c2;
//        int n = s.length();
//        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
//            l--;
//            r++;
//        }
//        return s.substring(l + 1  , r );
//    }
}
