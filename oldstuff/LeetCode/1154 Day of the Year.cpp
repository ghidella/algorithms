//https://leetcode.com/problems/day-of-the-year/

class Solution {
public:
    int dayOfYear(string date) {
        int day = stoi(date.substr(8, 2));
        int month = stoi(date.substr(5, 2));
        int year = stoi(date.substr(0, 4));
        vector<int> calendar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //checking lap year
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))calendar[1]++;
        
        int sol = 0;
        for(int i = 0; i < month - 1; i++) sol+= calendar[i];
        return sol+day;
    }
};