// https://leetcode.com/problems/maximum-number-of-balloons

// time complexity O(n) and space complexity O(1)
class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        String balloon = "balloon";

        for(char c : text.toCharArray()){
            if(balloon.indexOf(c) != -1){
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        return Math.min(charCount.getOrDefault('b', 0), 
                         Math.min(charCount.getOrDefault('a', 0), 
                         Math.min(charCount.getOrDefault('l', 0) / 2, 
                         Math.min(charCount.getOrDefault('o', 0) / 2, 
                                  charCount.getOrDefault('n', 0)))));

    }
}