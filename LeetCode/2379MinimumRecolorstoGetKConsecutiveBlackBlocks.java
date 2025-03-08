//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks


// time complexity O(n) space complexity O(1)
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l = 0;
        int minimumRecolors = k;
        int count = 0;
        for(int r = 0; r < blocks.length(); r++){
            if(blocks.charAt(r) == 'W') count++;
            //check if window
            if(r - l + 1 == k){
                if(count < minimumRecolors) minimumRecolors = count;
                if(blocks.charAt(l) == 'W') count--;
                l++;
            }
        }
        return minimumRecolors;
    }
}