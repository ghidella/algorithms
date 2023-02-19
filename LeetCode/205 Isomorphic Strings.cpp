//https://leetcode.com/problems/isomorphic-strings/

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int len = 0;
        while(s[len] != '\0'){
            len++;
        }

        for(int i = 0; i < len; i++){
            char aux = s[i];
            char aux2 = t[i];
            for(int j = 0; j < len; j++){
                if(aux == s[j]){
                    if(t[i] != t[j]) return false;
                }
                if(aux2 == t[j]){
                    if(s[i] != s[j]) return false;
                }
            }
        }
        return true;
    }
};