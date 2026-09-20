// Last updated: 20/09/2026, 21:50:03
1import java.util.*;
2
3class Solution {
4    public boolean wordPattern(String pattern, String s) {
5        String[] words = s.split(" ");
6        if (words.length != pattern.length()) return false;
7
8        Map<Character, String> charToWord = new HashMap<>();
9        Map<String, Character> wordToChar = new HashMap<>();
10
11        for (int i = 0; i < pattern.length(); i++) {
12            char c = pattern.charAt(i);
13            String w = words[i];
14
15            if (charToWord.containsKey(c)) {
16                if (!charToWord.get(c).equals(w)) return false;
17            } else {
18                charToWord.put(c, w);
19            }
20
21            if (wordToChar.containsKey(w)) {
22                if (wordToChar.get(w) != c) return false;
23            } else {
24                wordToChar.put(w, c);
25            }
26        }
27
28        return true;
29    }
30}
31