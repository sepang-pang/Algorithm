class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                int freqA = frequencyMap.get(nums[j]);
                int freqB = frequencyMap.get(nums[j + 1]);

                if (freqA > freqB || (freqA == freqB && nums[j] < nums[j + 1])) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }
}


/*
    try 1.
    - 빈도수 계산: O(n^2)
    - 버블 정렬: O(n^2)

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
*/