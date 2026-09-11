// Last updated: 11/09/2026, 09:27:47
class Solution {
    public int passThePillow(int n, int time) {
        int completed = time / (n-1);
        int remaining = time % (n-1);
        int ans = 0;
        if (completed % 2 != 0) {
            ans = n - remaining;
        } else {
            ans = remaining + 1;
        }
        return ans;
    }
}