public class FindNumber {
    public int solution(int num, int k) {
        int answer = 0;

//        String numItem = String.valueOf(num);
//        char[] numList = numItem.toCharArray();
//
//        String kItem = String.valueOf(k);
//        char[] kList = kItem.toCharArray();
//
//        for (int i = 0; i < kItem.length(); i++) {
//            for (int j = 0; j < numItem.length(); j++) {
//                    if (kList[i] == numList[j]) {
//                        answer = j + 1;
//                        break;
//                    } else {
//                        answer = -1;
//                    }
//            }
//        }

        String numItem = String.valueOf(num);
        String kItem = String.valueOf(k);

        answer = numItem.indexOf(kItem);


        return answer < 0 ? -1 : answer + 1;
    }


    public static void main(String[] args) {
        FindNumber findNumber = new FindNumber();
        int num = 92832;
        int k = 7;
        System.out.println(findNumber.solution(num, k));
    }
}
