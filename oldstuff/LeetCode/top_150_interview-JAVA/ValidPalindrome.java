// https://leetcode.com/problems/valid-palindrome

class Solution {
    public boolean isPalindrome(String s) {

        // Create new mutable string with only alphanumeric characters
        StringBuilder filtered = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                filtered.append(Character.toLowerCase(ch));
            }
        }

        // checks if the left side of the string is equal to the right side
        for(int i = 0; i < filtered.length()/2; i++){
            if(filtered.charAt(i) != filtered.charAt(filtered.length() - i - 1)) return false;
        }
        return true;
    }

    // my first approach was using only one loop but i guess the code are cleaner with this logic
}