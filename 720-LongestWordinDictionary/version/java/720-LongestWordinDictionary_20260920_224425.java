// Last updated: 20/09/2026, 22:44:25
1import java.util.*;
2
3class Solution {
4    public String[] reorderLogFiles(String[] logs) {
5        Arrays.sort(logs, (log1, log2) -> {
6            String[] split1 = log1.split(" ", 2);
7            String[] split2 = log2.split(" ", 2);
8            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
9            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
10
11            if (!isDigit1 && !isDigit2) {
12                // Both are letter-logs → sort by content, then identifier
13                int cmp = split1[1].compareTo(split2[1]);
14                if (cmp != 0) return cmp;
15                return split1[0].compareTo(split2[0]);
16            } else if (!isDigit1 && isDigit2) {
17                // Letter-log comes before digit-log
18                return -1;
19            } else if (isDigit1 && !isDigit2) {
20                // Digit-log comes after letter-log
21                return 1;
22            } else {
23                // Both are digit-logs → maintain original order
24                return 0;
25            }
26        });
27
28        return logs;
29    }
30}
31