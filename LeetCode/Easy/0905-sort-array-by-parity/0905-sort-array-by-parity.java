class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int oddPointer = 0;

        for (int evenPointer = 0; evenPointer < nums.length; evenPointer++) {
            if (nums[evenPointer] % 2 == 0) {

                int swap = nums[evenPointer];
                nums[evenPointer] = nums[oddPointer];
                nums[oddPointer] = swap;

                oddPointer++;
            }
        }

        return nums;
    }
}