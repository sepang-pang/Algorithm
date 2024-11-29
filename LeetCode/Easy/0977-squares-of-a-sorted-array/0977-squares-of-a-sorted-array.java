class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);
        
        return result;
    }
}

/*
    Try 1.
    RunTime : 437 ms
    Memory : 47.6 mb
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] result = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i] * nums[i];
            }

            for (int i = 0; i < result.length - 1; i++) {
                for (int j = 0; j < result.length - 1 - i; j++) {
                    if (result[j + 1] < result[j]) {
                        int swap = result[j + 1];
                        result[j + 1] = result[j];
                        result[j] = swap;
                    }
                }
            }
            return result;
        }
    }
*/


/*
    Two-Pointer 알아보기
*/
