import java.util.*;

public class Solution {
    public int solution(int n) {
        int result = 0;
        int i = n;
        
        while (i > 0) {
            result += i % 10;
            i /= 10;
        }

        return result;
    }
}