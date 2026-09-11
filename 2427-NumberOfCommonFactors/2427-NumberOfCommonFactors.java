// Last updated: 11/09/2026, 09:27:56
class Solution {
    public int commonFactors(int a, int b) {
        int minval = Math.min(a, b);
        int count = 0;
        for(int i = 1; i <= minval; i++){
            if(a % i == 0 && b % i == 0){
                count++;
            }
        }
        return count;
    }
}