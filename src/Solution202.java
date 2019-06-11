import java.util.HashSet;
import java.util.Set;

public class Solution202 {
    public boolean isHappy(int n) {
        if(n == 0)
            return false;
        if(n == 1)
            return true;
        Set<Integer> hash = new HashSet<>();
        int newN = n;
        while(!hash.contains(newN))
        {
            hash.add(newN);
            int tmp = 0;
            while(newN!=0)
            {
                int bit = newN%10;
                tmp = tmp+bit*bit;
                newN = newN/10;
            }
            newN = tmp;
            if(newN == 1)
                return true;
        }
        return false;
    }
}
