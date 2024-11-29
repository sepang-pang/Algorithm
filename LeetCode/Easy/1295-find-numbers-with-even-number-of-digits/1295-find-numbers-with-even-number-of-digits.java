class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;

        for (int num : nums) {
            if ((int)(Math.log10(num) + 1) % 2 == 0) {
                evenCount++;
            }
        }
        
        return evenCount;
    }
}

/*
        Try 1.
        Runtime : 1 ms
        Memory : 43.29 mb

        class Solution {
        public int findNumbers(int[] nums) {
            int evenCount = 0;

            for (int num : nums) {

                int divCount = 0;

                while (num > 0) {
                    num /= 10;
                    divCount++;
                }

                if (divCount % 2 == 0) {
                    evenCount++;
                }
            }

            return evenCount;
        }
    }
*/
