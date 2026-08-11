// Last updated: 11/08/2026, 22:59:41
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxdiagonal=0;
        int maxarea=0;

        for(int[] rectangle : dimensions){
            int length=rectangle[0];
            int width=rectangle[1];

            int diagonal=length*length+width*width;
            int area=length*width;

            if(maxdiagonal < diagonal) {
                maxdiagonal=diagonal;
                maxarea=area;
            }else if(diagonal==maxdiagonal && area>maxarea) {
                maxarea=area;
            }

        }
        return maxarea;
    }
}