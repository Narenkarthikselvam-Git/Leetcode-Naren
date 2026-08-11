// Last updated: 11/08/2026, 23:05:16
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length()-1;
        int count =0;
        for(int i=n;i>=0; i--){
            if(s.charAt(i) == ' ')
            {
                return count;
            }
            else{
            count ++;
            }

        }
        return count ;  
    }
}