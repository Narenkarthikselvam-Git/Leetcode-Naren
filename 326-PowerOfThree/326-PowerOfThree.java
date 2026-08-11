// Last updated: 11/08/2026, 23:03:25
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        while(n%3==0)
        n=n/3;
        if(n==1)
        return true;
        else
        return false;
        
    }
}