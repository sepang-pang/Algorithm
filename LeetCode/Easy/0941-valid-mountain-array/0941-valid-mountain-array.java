class Solution {
    public boolean validMountainArray(int[] arr) {
                if (arr.length < 3) {
            return false;
        }

        int l = 0;
        int r = arr.length - 1;

        while (l < arr.length - 2 && arr[l] < arr[l+1]) {
            if (arr[l] == arr[l+1]) {
                return false;
            }
            l ++;
        }

        while (arr[r] < arr[r-1] && r > 1) {
            if (arr[r] == arr[r-1]) {
                return false;
            }

            r--;
        }


        return l == r;
    }
}