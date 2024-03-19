// https://leetcode.com/problems/length-of-last-word

public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int index = s.length() - 1; // last character

        // ignore spaces at the end of the string
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }

        // obtain the length of the last word
        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }

        return length;
    }
}
