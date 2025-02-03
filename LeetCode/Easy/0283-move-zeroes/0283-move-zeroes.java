class Solution {
    public void moveZeroes(int[] nums) {
        int writePointer = 0;

        for (int readPointer = 0; readPointer < nums.length; readPointer++) {

            if (nums[readPointer] != 0) {
                int swap = nums[readPointer];
                nums[readPointer] = nums[writePointer];
                nums[writePointer] = swap;

                writePointer++;
            }
        }
    }
}