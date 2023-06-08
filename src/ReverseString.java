import java.util.Stack;

public class ReverseString {
    public String solution(String my_string) {
        Stack<Character> stack = new Stack<>();
        char[] charItem = new char[my_string.length()];
        String answer ="";

        for (int i = 0; i < my_string.length(); i++) {
            stack.push(my_string.charAt(i));
        }

        for (int i = 0; i < my_string.length(); i++) {
            charItem[i] = stack.pop();
            answer = String.valueOf(charItem);
        }
        return answer;
    }

    public static void main(String[] args) {
      ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.solution("coffee"));

    }
}
