// Last updated: 23/09/2026, 09:13:15
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; // no product can be < k if k <= 1

        int count = 0;
        long product = 1;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            // shrink window until product < k
            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }

            // all subarrays ending at right and starting from left..right are valid
            count += (right - left + 1);
        }

        return count;
    }
}
