// Last updated: 11/09/2026, 09:26:48
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        int[] max=new int[col];
        
        for(int j=0;j<col;j++){
            int maximum=-1;
            for(int i=0;i<row;i++){
                    maximum=Math.max(maximum,matrix[i][j]);
            }
            max [j]=maximum;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == -1) {
                    matrix[i][j] = max[j];
                }
            }
        }
        return matrix;
    }
}