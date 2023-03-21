//https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> sol;
        int count = 0;
        for(int i = 0; i < nums.size(); i++){
            count += nums[i];
            sol.push_back(count);
        }
        return sol;
    }
};