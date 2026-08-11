// Last updated: 11/08/2026, 23:04:33
class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {

            columnNumber--;   // Make it start from 0

            char ch = (char)('A' + (columnNumber % 26));

            result.append(ch);

            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}