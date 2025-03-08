// https://leetcode.com/problems/is-subsequence

// time complexity O(n) and space complexity O(1)
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;

        int tIndex = 0;
        int sIndex = 0;
        while(tIndex < t.length()){
            if(t.charAt(tIndex) == s.charAt(sIndex)){
                sIndex++;
                if(sIndex == s.length()) return true;
            }
            tIndex++;
        }
        return false;
    }
}