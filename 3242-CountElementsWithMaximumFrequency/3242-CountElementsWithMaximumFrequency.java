// Last updated: 11/08/2026, 22:59:43
class Solution {
    public int maxFrequencyElements(int[] nums) {
        byte[] freq = new byte[101];
        byte max = 0, res = 0;
        for (int n : nums) {
            byte f = ++freq[n];
            if (f > max) {
                max = f; res = f;
            } else if (f == max) 
                res += f;
        }
        return res;
    }
}