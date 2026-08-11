// Last updated: 11/08/2026, 23:02:08
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak is on the right
                left = mid + 1;
            } else {
                // Peak is at mid or on the left
                right = mid;
            }
        }

        return left;
    }
}