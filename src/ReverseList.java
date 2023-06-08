import java.util.Stack;

public class ReverseList {
    public int[] solution(int[] num_list) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[num_list.length];
        for (int i : num_list) {
            stack.push(i);
        }
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        int[] testList = {1, 3, 4, 77, 12, 321};
        for (int resultReverseItem :reverseList.solution(testList)) {
            System.out.print(resultReverseItem + " ");
        }
    }
}