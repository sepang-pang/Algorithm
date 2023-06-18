import java.util.*;

class AnalogousList {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

//        // 중복 제거를 위해 set 생성
//        Set<String> set1 = new HashSet<>(Arrays.asList(s1));
//        Set<String> set2 = new HashSet<>(Arrays.asList(s2));
//
//        // 두 Set 비교
//        for (String setItem : set1) {
//            if (set2.contains(setItem)) {
//                answer ++;
//            }
//        }

//        for (int i = 0; i < s1.length; i++) {
//            for (int j = 0; j < s2.length; j++) {
//                if (s1[i].equals(s2[j])) {
//                    answer++;
//                }
//            }
//        }

        for (String s1Item : s1) {
            for (String s2Item : s2) {
                if (s1Item.equals(s2Item)){
                    answer ++;
                }
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

