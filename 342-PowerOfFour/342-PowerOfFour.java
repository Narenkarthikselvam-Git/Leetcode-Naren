// Last updated: 11/08/2026, 23:03:22
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1) return false;
        if(n==1) return true;
         while(n%4==0)
         {
            n=n/4;
         }
          if(n==1)
          return true;
          else
          return false; 
    }
}