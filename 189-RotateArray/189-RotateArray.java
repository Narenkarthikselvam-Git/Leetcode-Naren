// Last updated: 11/08/2026, 23:04:26
class Solution {
    // Three Traversal Method

    public void rotate(int[] nums, int k) {
        int len = nums.length; 
        int p = k % len;
        if (len == 1 || p == 0) return;

        // Reversing the whole array
        for (int i = 0; i < len/2; i++) {
            int temp = nums[i];            
            nums[i] = nums[len - i - 1]; 
            nums[len-i-1] = temp;
        }

        // Reversing the first (k % nums.length) elements 
        for (int i=0; i<p/2; i++) {
            int temp = nums[i];            
            nums[i] = nums[p-i-1]; 
            nums[p-i-1] = temp;
        }

        // Reversing the remaining elements 
        for (int i = p; i < p + (len-p)/2; i++) {
            int temp = nums[i];            
            nums[i] = nums[len - i - 1 + p]; 
            nums[len - i - 1 + p] = temp;
        }
    }
}