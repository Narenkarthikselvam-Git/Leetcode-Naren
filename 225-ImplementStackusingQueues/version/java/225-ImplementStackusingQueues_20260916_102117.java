// Last updated: 16/09/2026, 10:21:17
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        int i = s.length() - 1;
4        int j = t.length() - 1;
5        int skipS = 0, skipT = 0;
6
7        while (i >= 0 || j >= 0) {
8            // Process backspaces in s
9            while (i >= 0) {
10                if (s.charAt(i) == '#') {
11                    skipS++;
12                    i--;
13                } else if (skipS > 0) {
14                    skipS--;
15                    i--;
16                } else {
17                    break;
18                }
19            }
20
21            // Process backspaces in t
22            while (j >= 0) {
23                if (t.charAt(j) == '#') {
24                    skipT++;
25                    j--;
26                } else if (skipT > 0) {
27                    skipT--;
28                    j--;
29                } else {
30                    break;
31                }
32            }
33
34            // Compare characters
35            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
36                return false;
37            }
38
39            // If one string is finished but the other is not
40            if ((i >= 0) != (j >= 0)) {
41                return false;
42            }
43
44            i--;
45            j--;
46        }
47
48        return true;
49    }
50}
51