//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string

class Solution {
public:
    int strStr(string haystack, string needle) {
        size_t i = haystack.find(needle);
        if(haystack.size() == 0 || i == std::string::npos) return -1;
        return i;
    }           
};