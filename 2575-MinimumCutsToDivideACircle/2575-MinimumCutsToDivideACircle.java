// Last updated: 11/08/2026, 23:00:22
class Solution {
    public int numberOfCuts(int n) {
        if(n==1)
        return 0;
        else if(n%2!=0)
        return n;
        else
        return n/2;
        
    }
}