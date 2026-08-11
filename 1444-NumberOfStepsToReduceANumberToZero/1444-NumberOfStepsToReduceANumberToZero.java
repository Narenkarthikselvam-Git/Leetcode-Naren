// Last updated: 11/08/2026, 23:01:16
class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if(num%2==0){
                num/=2;
            }else{
                num-=1;
            }
            count++;
        }
        return count;
    }
}