// Last updated: 20/09/2026, 22:26:22
1import java.util.*;
2
3class Solution {
4    public String longestWord(String[] words) {
5        Arrays.sort(words); // sort lexicographically
6        Set<String> built = new HashSet<>();
7        String result = "";
8
9        for (String word : words) {
10            if (word.length() == 1 || built.contains(word.substring(0, word.length() - 1))) {
11                built.add(word);
12                if (word.length() > result.length()) {
13                    result = word;
14                }
15            }
16        }
17
18        return result;
19    }
20}
21