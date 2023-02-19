//https://leetcode.com/problems/isomorphic-strings/
//Optimized solution O(n)
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        char sMap[128] = {0};
        char tMap[128] = {0};

        for(size_t i = 0; i < s.size(); i++){
            char sChar = s[i];
            char tChar = t[i];

            if (sMap[sChar] && sMap[sChar] != tChar) {
            return false;
            }
        
            if (tMap[tChar] && tMap[tChar] != sChar) {
            return false;
            }
    
            sMap[sChar] = tChar;
            tMap[tChar] = sChar;
        }
        return true;
    }
};

//O(n^2)
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