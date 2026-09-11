// Last updated: 11/09/2026, 09:31:15
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            // Pair is correct: nums[mid] == nums[mid + 1]
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } 
            else {
                high = mid;
            }
        }

        return nums[low];
    }
}