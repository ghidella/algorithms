//https://leetcode.com/problems/plus-one/

class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        bool carry = true;
        for(int i = digits.size()-1; i >= 0 && carry; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i]++;
                carry = false;
            }
        }
        if(carry){
            digits.insert(digits.begin(), 1);
        }
        return digits;
    }
};