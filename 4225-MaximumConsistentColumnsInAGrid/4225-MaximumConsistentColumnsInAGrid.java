// Last updated: 11/08/2026, 22:59:21
class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int m=grid.length;
        int n=grid[0].length;
        int[] dp=new int[n];
        java.util.Arrays.fill(dp, 1);
        int ans=1;

        for(int j=0;j<n;j++){
            for(int i=0;i<j;i++){
                if(isValid(grid,m,i,j,limit)) {
                    dp[j]=Math.max(dp[j], dp[i]+1);
                }
            }
            ans=Math.max(ans,dp[j]);
        }
        return ans;
    }
    private boolean isValid(int[][] grid,int m,int i,int j,int limit){
        for(int r=0;r<m;r++){
            if(Math.abs(grid[r][j]-grid[r][i])>limit) {
                return false;
            }
        }
        return true;
    }
}