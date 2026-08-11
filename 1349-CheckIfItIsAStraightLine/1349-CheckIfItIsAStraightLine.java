// Last updated: 11/08/2026, 23:01:22
class Solution {
    public double findSlope(double diff2, double diff1) {
        return diff2 / diff1;
    }

    public boolean checkStraightLine(int[][] coordinates) {

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        double slope;

        if (x2 == x1)
            slope = Integer.MAX_VALUE;
        else
            slope = findSlope(y2 - y1, x2 - x1);

        int n = coordinates.length;

        for (int i = 1; i + 1 < n; i++) {

            x1 = coordinates[i][0];
            y1 = coordinates[i][1];
            x2 = coordinates[i + 1][0];
            y2 = coordinates[i + 1][1];

            double currSlope;

            if (x2 == x1)
                currSlope = Integer.MAX_VALUE;
            else
                currSlope = findSlope(y2 - y1, x2 - x1);

            if (currSlope != slope)
                return false;
        }

        return true;
    }
}