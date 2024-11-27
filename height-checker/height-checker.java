class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;

        int[] expected = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }

        for (int i = 0; i < heights.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < heights.length - i - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    int swap = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = swap;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != heights[i]) {
                count ++;
            }
        }

        return count;
    }
}