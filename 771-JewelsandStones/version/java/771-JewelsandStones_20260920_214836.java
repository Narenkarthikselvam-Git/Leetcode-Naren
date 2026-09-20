// Last updated: 20/09/2026, 21:48:36
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        int[] count = new int[26]; // frequency array for magazine letters
4
5        for (char c : magazine.toCharArray()) {
6            count[c - 'a']++;
7        }
8
9        for (char c : ransomNote.toCharArray()) {
10            if (count[c - 'a'] == 0) {
11                return false; // letter not available
12            }
13            count[c - 'a']--; // use one occurrence
14        }
15
16        return true;
17    }
18}
19