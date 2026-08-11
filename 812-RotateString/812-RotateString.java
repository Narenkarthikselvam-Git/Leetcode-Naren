// Last updated: 11/08/2026, 23:02:16
class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length())
            return false;

        for(int i=0;i<s.length();i++){

            if(s.equals(goal))
                return true;

            s = s.substring(1) + s.charAt(0);
        }

        return false;
    }
}