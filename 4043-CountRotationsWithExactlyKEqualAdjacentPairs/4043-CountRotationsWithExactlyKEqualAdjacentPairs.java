// Last updated: 11/09/2026, 09:26:35
class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        if (n<=1) {
            return (k == 0) ? n: 0;
        }
        int totalCircularMatches =0;
        for(int i =0;i<n;i++){
            if(s.charAt(i) == s.charAt((i+1)% n)) {
                totalCircularMatches++;
            }
        }
        int resultCount =0;
        for(int j=0;j<n;j++){
            int prevIndex =(j-1+n)%n;
        
            int currentScore = totalCircularMatches;
            if (s.charAt(prevIndex)==s.charAt(j)) {
                currentScore--;
            }
            if(currentScore ==k){
                resultCount++;
            }
        }
        return resultCount;
    }
}