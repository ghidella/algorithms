//https://leetcode.com/problems/sqrtx/


//optimized solution with binary search O(log(x))
class Solution {
public:
    int mySqrt(int x) {
        if(x > 0 && x < 2) return 1;
        long int left = 1, right = x/2, sol = 0;
        while(left <= right){
            long int mid = left + (right-left)/2;
            if(mid <= x/mid){
                sol = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return sol;
    }
};




//first solution O(sqrt(x))
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