// Last updated: 11/08/2026, 23:04:14
class Solution {
    private static int squareSum(int num){
        int ans = 0;
        while(num > 0){
            int rem = num%10;
            ans += rem*rem;
            num/=10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do{
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        }while(slow != fast);
        if(slow == 1) return true;
        return false;
    }
}