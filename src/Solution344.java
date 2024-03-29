public class Solution344 {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) return;
        if (s.length < 2) return;
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
