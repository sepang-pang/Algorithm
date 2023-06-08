import java.util.HashMap;

public class FrequentValue {

    int solution(int array[], int array_len) {
        int answer = 0;
        int count = 0;
        int check = 0;
        for(int i = 0; i < array_len; i++){
            for(int j = i; j < array_len;j++){
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if(count > check){
                answer = array[i];
                check = count;
            }
            else if(count == check){
                answer = -1;
            }
            count = 0;
        }
        return answer;
    }


    public static void main(String[] args) {
        FrequentValue frequentValue = new FrequentValue();
        int[] array1 = new int[]{1, 2, 3, 3, 3, 4};

        System.out.println(frequentValue.solution(array1, 6));


    }
}
