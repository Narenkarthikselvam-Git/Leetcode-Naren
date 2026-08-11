// Last updated: 11/08/2026, 23:04:37
class Solution {
    public int singleNumber(int[] nums) {
     int ans=0;
     for(int i=0;i<nums.length;i++)
     ans^=nums[i];
     return ans;
    }
}   