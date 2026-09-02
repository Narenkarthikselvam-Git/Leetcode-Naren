// Last updated: 02/09/2026, 09:57:21
1import java.util.*;
2
3class Solution {
4    public String simplifyPath(String path) {
5
6        Stack<String> stack = new Stack<>();
7
8        String[] parts = path.split("/");
9
10        for (String part : parts) {
11
12            if (part.equals("") || part.equals(".")) {
13                continue;
14            }
15
16            if (part.equals("..")) {
17                if (!stack.isEmpty()) {
18                    stack.pop();
19                }
20            } 
21            else {
22                stack.push(part);
23            }
24        }
25
26        StringBuilder result = new StringBuilder();
27
28        for (String folder : stack) {
29            result.append("/").append(folder);
30        }
31
32        if (result.length() == 0) {
33            return "/";
34        }
35
36        return result.toString();
37    }
38}