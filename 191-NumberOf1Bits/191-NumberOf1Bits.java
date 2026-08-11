// Last updated: 11/08/2026, 23:04:18
class Solution {
    public int hammingWeight(int n) {
        int i=0,res=0;
        while(n>0){
            int r = n%2;
            if(r==1) res++;
            n /=2;
        }
        return res;
    }
}