// Last updated: 11/09/2026, 09:27:16
import java.util.*;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                ans.add(i);
            }
        }

        return ans;
    }
}