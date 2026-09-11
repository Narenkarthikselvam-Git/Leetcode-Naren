// Last updated: 11/09/2026, 09:31:39
import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {

            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        // If k is still remaining, remove from the end
        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();

        // Remove leading zeros
        boolean leadingZero = true;

        for (char digit : stack) {
            if (leadingZero && digit == '0') {
                continue;
            }

            leadingZero = false;
            result.append(digit);
        }

        if (result.length() == 0) {
            return "0";
        }

        return result.toString();
    }
}