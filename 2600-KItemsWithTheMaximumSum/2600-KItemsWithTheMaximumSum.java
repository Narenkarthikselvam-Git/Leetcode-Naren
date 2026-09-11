// Last updated: 11/09/2026, 09:27:40
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        while(numOnes>0 && k>0) {
            sum=sum+1;
            numOnes--;
            k--;
        }
        while(numZeros>0 && k>0) {
            numZeros--;
            k--;
        }
        while(numNegOnes>0 && k>0) {
            sum--;
            numNegOnes++;
            k--;
        }
        return sum;
    }
}
