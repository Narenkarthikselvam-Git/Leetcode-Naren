// Last updated: 11/08/2026, 22:59:16
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return  convertToSeconds(endTime) - convertToSeconds(startTime);
    }

    private int convertToSeconds(String time){
        String[] parts= time.split(":");
        int h=Integer.parseInt(parts[0]);
        int m=Integer.parseInt(parts[1]);
        int s=Integer.parseInt(parts[2]);
        return h * 3600 + m * 60 + s;
    }
}