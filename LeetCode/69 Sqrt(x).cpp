//https://leetcode.com/problems/sqrtx/

class Solution {
public:
    int mySqrt(int x) {
        long int i;
        if(x <= 2 && x > 0) return 1;
        for(i = 0; i < x; i++){
            if(i*i == x) return i;
            if(i*i > x && (i-1)*(i-1) < x) return i-1;
        }
       return i; 
    }
};