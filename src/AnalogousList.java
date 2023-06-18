import java.util.*;

class AnalogousList {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        // 중복 제거를 위해 set 생성
        Set<String> set1 = new HashSet<>(Arrays.asList(s1));
        Set<String> set2 = new HashSet<>(Arrays.asList(s2));

        // 두 Set 비교
        for (String setItem : set1) {
            if (set2.contains(setItem)) {
                answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        AnalogousList analogousList = new AnalogousList();

        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"com", "b", "d", "p", "c"};

        System.out.println(analogousList.solution(arr1, arr2));

    }
}

