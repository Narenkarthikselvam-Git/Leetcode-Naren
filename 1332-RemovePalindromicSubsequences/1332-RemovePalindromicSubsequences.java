// Last updated: 23/09/2026, 09:11:35
class Solution {
    public int removePalindromeSub(String s) {
        // If the string is a palindrome, remove it in one step
        if (isPalindrome(s)) {
            return 1;
        }
        // Otherwise, remove all 'a' and then all 'b'
        return 2;
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
