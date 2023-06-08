public class DoubleList {

        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];
            for(int i = 0; i < numbers.length; i++ ) {
               int doubleNum = numbers[i] * 2;
               answer[i] = doubleNum;
            }
            return answer;
        }


    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        DoubleList doubleList = new DoubleList();
        int[] result = doubleList.solution(arr);
        for (int num : result) {
            System.out.println(num);
        }

    }
}
