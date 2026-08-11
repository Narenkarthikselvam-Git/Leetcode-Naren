// Last updated: 11/08/2026, 23:04:30
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
}