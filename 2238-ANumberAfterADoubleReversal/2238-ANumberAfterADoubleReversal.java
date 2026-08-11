// Last updated: 11/08/2026, 23:00:33
class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1 = reverse(num);
        int rev2 = reverse(rev1);
        return num == rev2;
    }

    public int reverse(int x) {
        long ans = 0;
        while(x != 0){
            ans = (ans * 10) + (x%10);
            x /= 10;
        }
        return (int) ans;
    }
}
    