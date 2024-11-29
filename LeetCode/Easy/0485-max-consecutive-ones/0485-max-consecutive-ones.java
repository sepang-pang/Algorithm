class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currCount = 0;

         for (int num : nums) {
            maxCount = Math.max(maxCount, currCount = (num == 1) ? currCount + 1 : 0);
        }
        
        return maxCount;
    }
}

/*
    Try 2.
    Runtime : 3 ms
    Memory : 50.39 nmb
    
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxCount = 0;
            int currCount = 0;

            for (int num : nums) {
                currCount = (num == 1) ? currCount + 1 : 0;

                if (maxCount < currCount) {
                    maxCount = currCount;
                }
            }

            return maxCount;
        }
    }
*/
/*
    Try 1.
    Runtime : 2 ms
    Memory : 49.95 mb
    
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxCount = 0;
            int currCount = 0;

            for (int i = 0; i < nums.length; i++) {
                currCount = (nums[i] == 1) ? currCount + 1 : 0;

                if (maxCount < currCount) {
                    maxCount = currCount;
                }
            }

            return maxCount;
        }
    }
*/

/*
    1. 0 과 1 중 연속된 횟수가 더 많은 요소의 연속된 횟수를 반환하는 것인 줄 알았다.
    2. 그냥 단순히 1만 연속된 횟수 중 가장 높은 횟수를 반환하는 것이었다.
    public static int solution(int[] nums) {

        int maxCount = 0;
        int prev = 0;
        int curr = 0;

        int[] arrs = new int[]{0, 1};

        for (int num : arrs) {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    curr++;
                } else if (nums[i] != num) {
                    curr = 0;
                }
                if (prev < curr) {
                    prev = curr;
                }
            }

            if (maxCount < prev) {
                maxCount = prev;
            }
        }

        return maxCount;
    }

*/