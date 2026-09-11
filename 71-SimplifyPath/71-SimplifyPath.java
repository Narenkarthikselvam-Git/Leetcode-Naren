// Last updated: 11/09/2026, 09:33:08
import java.util.*;

class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {

            if (part.equals("") || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } 
            else {
                stack.push(part);
            }
        }

        StringBuilder result = new StringBuilder();

        for (String folder : stack) {
            result.append("/").append(folder);
        }

        if (result.length() == 0) {
            return "/";
        }

        return result.toString();
    }
}