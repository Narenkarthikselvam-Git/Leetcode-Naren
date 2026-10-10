// Last updated: 10/10/2026, 09:33:57
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n = nums.length;
4        int[] st = new int[2*n];
5        int idx = -1;
6        for(int i=n-1; i>=0; i--)
7            st[++idx] = nums[i];
8        int[] res = new int[n];
9        for(int i=n-1; i>=0; i--){
10            while(idx >=0 && st[idx] <= nums[i])
11                idx--;
12            if(idx < 0)
13                res[i] = -1;
14            else 
15                res[i] = st[idx];
16            st[++idx] = nums[i];
17        }
18        return res;
19    }
20}