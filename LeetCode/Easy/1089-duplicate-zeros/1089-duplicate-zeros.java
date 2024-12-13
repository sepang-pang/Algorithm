class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zeros++;
        }

        int writeIdx = n + zeros - 1; 

        for (int i = n - 1; i >= 0; i--) {
            if (writeIdx < n) {
                arr[writeIdx] = arr[i];
            }
            writeIdx--;

            if (arr[i] == 0) {
                if (writeIdx < n) {
                    arr[writeIdx] = 0;
                }
                writeIdx--;
            }
        }
    }
}
