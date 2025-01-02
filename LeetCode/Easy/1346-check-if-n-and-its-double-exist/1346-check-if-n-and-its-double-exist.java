class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean result = false;

        if (arr.length == 0) {
            return result;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j] * 2) {
                        result = true;
                    }
                }
            }
        }

        return result;
    }
}