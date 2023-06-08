public class Share {
    int solution(int num1, int num2) {
        int answer = 0;
        if ((0 < num1 && num1 <= 100) && (0 < num2 && num2 <= 100)) {
            answer = num1 / num2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Share share = new Share();

        System.out.println(share.solution(10, 2));
        System.out.println(share.solution(7, 2));
    }
}
