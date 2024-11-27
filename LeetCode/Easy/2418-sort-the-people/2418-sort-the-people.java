class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
         for (int i = 0; i < heights.length -1; i++) { // ==== > O(n)

            int maxIdx = i;

            for (int j = i + 1; j < heights.length; j++) { // ==== > O(n)
                if (heights[maxIdx] < heights[j]) {
                    maxIdx = j;
                }
            }

            int heightSwap = heights[i];
            heights[i] = heights[maxIdx];
            heights[maxIdx] = heightSwap;

            String nameSwap = names[i];
            names[i] = names[maxIdx];
            names[maxIdx] = nameSwap;

        }
        return names;
    }
}

/*
    Try 1. fail
    이유 : 키 배열을 정렬 하고나서, 동기화 시켜주지 않아서
    해결 : 키 배열 정렬 후 동기화 시켜줌
    
    public static String[] solution(String[] names, int[] heights) {

        for (int i = 0; i < heights.length -1; i++) {

            int maxIdx = i;

            for (int j = i + 1; j < heights.length; j++) {
                if (heights[maxIdx] < heights[j]) {
                    maxIdx = j;
                }
            }

            String swap = names[i];
            names[i] = names[maxIdx];
            names[maxIdx] = swap;

        }
        return names;
    }
*/