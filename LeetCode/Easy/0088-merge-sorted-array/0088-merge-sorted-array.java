class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                if (n != 0) {
                    nums1[i] = nums2[n - 1];
                    n--;
                }
            }
        }

        for (int i = 0; i < nums1.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < nums1.length - 1 - i; j++) {
                if (nums1[j + 1] < nums1[j]) {
                    int swap = nums1[j + 1];
                    nums1[j + 1] = nums1[j];
                    nums1[j] = swap;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}