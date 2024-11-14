import java.util.*;

class Solution {
    public int[] solution(long n) {
        Queue<Integer> queue = new LinkedList<>();

        while (n > 0) {
              queue.offer((int) (n % 10));
            n /= 10;
        }

        int[] answer = new int[queue.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }
}