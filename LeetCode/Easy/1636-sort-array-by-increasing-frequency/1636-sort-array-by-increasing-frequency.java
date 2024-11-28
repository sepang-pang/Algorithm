class Solution {
    public int[] frequencySort(int[] nums) {
         Set<Integer> integerSet = new HashSet<>();

        for (int num : nums) {
            integerSet.add(num);
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : integerSet) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (num == nums[i]) {
                    count++;
                }
            }
            map.put(num, count);
        }

        for (int i = 0; i < nums.length -1; i++) {
           for (int j = 0; j < nums.length -1 -i; j++) {
               if (map.get(nums[j]) > map.get(nums[j+1])) {
                   int swap = nums[j];
                   nums[j] = nums[j+1];
                   nums[j + 1] = swap;
               } else if (map.get(nums[j]).equals(map.get(nums[j+1]))) {
                   if (nums[j] < nums[j+1]) {
                       int swap = nums[j];
                       nums[j] = nums[j+1];
                       nums[j + 1] = swap;
                   }
               }
           }
        }

        return nums;
    }
}