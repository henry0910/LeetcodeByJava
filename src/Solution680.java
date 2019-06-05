public class Solution680 {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return isPalindromic(s, l, r - 1) || isPalindromic(s, l + 1, r);
            l++;
            r--;
        }
        return true;
    }

    private boolean isPalindromic(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
//    public boolean validPalindrome(String s) {
//        if (s == null || s.length() == 0) return false;
//        if (s.length() == 1) return true;
//        if (isPalindrome(s)) return true;
//        for (int i = 0; i < s.length(); ++i) {
//            String current = buildString(s, i);
//            if (isPalindrome(current)) return true;
//        }
//        return false;
//    }
//    private boolean isPalindrome(String s) {
//        if (s.length() == 1) return true;
//        int left = 0;
//        int right = s.length() - 1;
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) return false;
//            left++;
//            right--;
//        }
//        return true;
//
//    }
//    private String buildString(String s, int index) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); ++i) {
//            if (i != index) sb.append(s.substring(i, i+1));
//        }
//        return sb.toString();
//    }
}
