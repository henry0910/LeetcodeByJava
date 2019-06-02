import java.util.Stack;

public class Solution682 {
    private static int calPoints(String[] ops) {
        Stack<Integer> res = new Stack<>();
        for (String s : ops) {
            if (!s.equals("C") && !s.equals("D") && !s.equals("+")) {
                res.push(Integer.parseInt(s));
            }
            else if (s.equals("C")) res.pop();
            else if (s.equals("D")) {
                int last = 2*res.peek();
                res.push(last);
            }
            else if (s.equals("+")) {
                int last = res.pop();
                int prev = res.peek();
                int result = last + prev;
                res.push(last);
                res.push(result);
            }

        }
        int total = 0;
        for (Integer i : res) total += i;
        return total;

    }

    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(ops));
    }
}
