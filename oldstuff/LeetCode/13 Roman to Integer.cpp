#include <map>

class Solution {
public:
    int romanToInt(string s) {
        std::map<char, int> num {{'I', 1}, {'V', 5}, {'X', 10}, {'L', 50},
        {'C', 100}, {'D', 500}, {'M', 1000}};

        int sol = 0;
        for(int i = 0; i < s.length(); i++){
            if(num[s[i + 1]] > num[s[i]]){
                sol += num[s[i + 1]] - num[s[i]];
                i++;
                continue;
            }
            sol += num[s[i]];
        }
        return sol;
    }

};