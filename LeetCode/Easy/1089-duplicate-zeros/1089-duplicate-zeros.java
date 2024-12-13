class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n - 1) {
            if (arr[i] == 0) {
                for (int j = n - 2; j > i; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[i + 1] = 0;
                i++;
            }
            i++;
        }
    }
}