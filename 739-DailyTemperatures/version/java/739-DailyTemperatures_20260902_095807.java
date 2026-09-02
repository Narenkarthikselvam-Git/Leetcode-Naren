// Last updated: 02/09/2026, 09:58:07
1import java.util.*;
2
3class Solution {
4    public String decodeString(String s) {
5
6        Stack<Integer> countStack = new Stack<>();
7        Stack<StringBuilder> stringStack = new Stack<>();
8
9        StringBuilder current = new StringBuilder();
10        int num = 0;
11
12        for (char ch : s.toCharArray()) {
13
14            if (Character.isDigit(ch)) {
15                num = num * 10 + (ch - '0');
16            }
17
18            else if (ch == '[') {
19                countStack.push(num);
20                stringStack.push(current);
21
22                num = 0;
23                current = new StringBuilder();
24            }
25
26            else if (ch == ']') {
27                int repeat = countStack.pop();
28                StringBuilder previous = stringStack.pop();
29
30                for (int i = 0; i < repeat; i++) {
31                    previous.append(current);
32                }
33
34                current = previous;
35            }
36
37            else {
38                current.append(ch);
39            }
40        }
41
42        return current.toString();
43    }
44}