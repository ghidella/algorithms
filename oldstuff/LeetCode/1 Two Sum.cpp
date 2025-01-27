//https://leetcode.com/problems/two-sum/

//linear solution
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> nums_map;
        vector<int> sol_pair = {0, 0};
        for(int i = 0; i < nums.size(); i++){
            int sol = target - nums[i];
            if(nums_map.find(sol) != nums_map.end()){
                sol_pair[0] = i;
                sol_pair[1] = nums_map[sol];
                return sol_pair;
            }
            nums_map[nums[i]] = i;
        }
        return sol_pair;
    }
};
