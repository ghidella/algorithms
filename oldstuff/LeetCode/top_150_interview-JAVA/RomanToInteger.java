// https://leetcode.com/problems/roman-to-integer/


// bruteforce solution
class Solution {
    public int romanToInt(String s) {
        int n = s.length() - 1;
        int answer = 0;
        boolean lastDigitCheck = false;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'I'){
                if(s.charAt(i+1) == 'V'){
                    answer += 4;
                    i+=1;
                } else if(s.charAt(i+1) == 'X'){
                    answer += 9;
                    i+=1;
                } else {
                    answer += 1;
                }
            } else if(s.charAt(i) == 'X'){
                if(s.charAt(i+1) == 'L'){
                    answer += 40;
                    i+=1;
                } else if(s.charAt(i+1) == 'C'){
                    answer += 90;
                    i+=1;
                } else {
                    answer += 10;
                }
            } else if(s.charAt(i) == 'C'){
                if(s.charAt(i+1) == 'D'){
                    answer += 400;
                    i+=1;
                } else if(s.charAt(i+1) == 'M'){
                    answer += 900;
                    i+=1;
                } else {
                    answer += 100;
                }
            } 
            else if(s.charAt(i) == 'V') { answer += 5; }
            else if(s.charAt(i) == 'L') { answer += 50; }
            else if(s.charAt(i) == 'D') { answer += 500; }
            else if(s.charAt(i) == 'M') { answer += 1000; }

            if(i >= s.length() - 1) lastDigitCheck = true;
        }
        if(!lastDigitCheck){
            if(s.charAt(n) == 'I') answer += 1;
            else if(s.charAt(n) == 'V')answer += 5;
            else if(s.charAt(n) == 'X')answer += 10;
            else if(s.charAt(n) == 'L')answer += 50;
            else if(s.charAt(n) == 'C')answer += 100;
            else if(s.charAt(n) == 'D')answer += 500;
            else if(s.charAt(n) == 'M')answer += 1000;
        }
        return answer;
    }
}


// refactored solution

class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int current = valueOf(s.charAt(i));
            int next = (i < n - 1) ? valueOf(s.charAt(i + 1)) : 0;
            
            if (current < next) {
                answer -= current;
            } else {
                answer += current;
            }
        }
        return answer;
    }

    private int valueOf(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
