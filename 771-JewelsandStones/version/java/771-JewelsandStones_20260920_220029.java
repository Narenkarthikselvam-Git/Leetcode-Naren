// Last updated: 20/09/2026, 22:00:29
1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0, right = s.length() - 1;
4
5        while (left < right) {
6            // Move left pointer until alphanumeric
7            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
8                left++;
9            }
10            // Move right pointer until alphanumeric
11            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
12                right--;
13            }
14
15            // Compare characters (case-insensitive)
16            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
17                return false;
18            }
19
20            left++;
21            right--;
22        }
23
24        return true;
25    }
26}
27