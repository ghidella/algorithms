https://leetcode.com/problems/longest-common-prefix/

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string sol = "";

        if(strs.empty()) return sol;
        
        int i = 0;
        while(true){
            if(i >= strs[0].size()) return sol;
            char aux = strs[0][i];
            for(int j = 1; j < strs.size(); j++){
                if(i >= strs[j].size() || strs[j][i] != aux){
                    return sol;
                }
            }
            sol += aux;
            i++;
        }  
        
        return sol;      
    }
};