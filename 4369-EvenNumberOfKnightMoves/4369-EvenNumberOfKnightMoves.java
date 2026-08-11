// Last updated: 11/08/2026, 22:59:23
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int sumStart=start[0] + start[1];
        int sumTarget=target[0] + target[1];
        return (sumStart - sumTarget)%2==0;
    }
}