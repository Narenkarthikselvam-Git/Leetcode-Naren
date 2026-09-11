// Last updated: 11/09/2026, 09:28:58
class Solution {
    public int subtractProductAndSum(int n) {
        int product= 1;
        int sum= 0;
        while(n>0) {
            int digits;
            digits= n % 10;
            product*=digits;
            sum+=digits;
            n/=10;
        }
        return product-sum;
    }
}
        