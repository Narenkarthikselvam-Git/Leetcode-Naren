// Last updated: 20/09/2026, 21:42:52
1class Solution {
2    public String addStrings(String num1, String num2) {
3        StringBuilder sb = new StringBuilder();
4        int i = num1.length() - 1;
5        int j = num2.length() - 1;
6        int carry = 0;
7
8        while (i >= 0 || j >= 0 || carry > 0) {
9            int sum = carry;
10            if (i >= 0) sum += num1.charAt(i--) - '0';
11            if (j >= 0) sum += num2.charAt(j--) - '0';
12
13            sb.append(sum % 10);   // add current digit
14            carry = sum / 10;      // update carry
15        }
16
17        return sb.reverse().toString();
18    }
19}
20