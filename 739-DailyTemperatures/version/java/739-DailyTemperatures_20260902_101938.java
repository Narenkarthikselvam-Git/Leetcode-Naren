// Last updated: 02/09/2026, 10:19:38
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6
7        int left = 1;
8        int right = n;
9
10        while (left < right) {
11
12            int mid = left + (right - left) / 2;
13
14            if (isBadVersion(mid)) {
15                right = mid;
16            } else {
17                left = mid + 1;
18            }
19        }
20
21        return left;
22    }
23}