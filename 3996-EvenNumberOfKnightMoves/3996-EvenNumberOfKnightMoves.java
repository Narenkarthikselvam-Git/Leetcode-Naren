// Last updated: 11/09/2026, 09:26:31
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int sumStart=start[0] + start[1];
        int sumTarget=target[0] + target[1];
        return (sumStart - sumTarget)%2==0;
    }
}