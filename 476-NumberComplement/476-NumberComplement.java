// Last updated: 11/08/2026, 23:02:55
class Solution {
    public int findComplement(int num) {
        int mask=0;
        int temp=0;
        temp= num;
        while (temp > 0)
        {
            mask = (mask << 1);
            mask=mask^1;
            temp >>=1;
        }        
         return mask^num;
    }

}