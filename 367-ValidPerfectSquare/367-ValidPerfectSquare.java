// Last updated: 11/08/2026, 23:03:13
class Solution {
    public boolean isPerfectSquare(int num){
        for(long i=0;i*i<=num;i++){
            if(i*i == num){
                return true;
            }
        }
        return false;
    }
}