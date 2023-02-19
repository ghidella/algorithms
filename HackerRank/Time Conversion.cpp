//https://www.hackerrank.com/challenges/time-conversion/problem

string timeConversion(string s) {
    // Transforming time information to integers
    int h = stoi(s.substr(0, 2));
    int m = stoi(s.substr(3, 2));
    int sc = stoi(s.substr(6, 2));
    string time = s.substr(8, 2);
    
    // Converting 
    if(time == "PM" && h != 12) h += 12;
    else if(time == "AM" && h == 12) h = 0;
    
    // Creating solution string
    string sol; //= to_string(h) + ":" + to_string(m) + ":" + to_string(sc);
    if(h < 10) sol = "0" + to_string(h) + ":";
    else sol = to_string(h) + ":";
    
    if(m < 10) sol += "0" + to_string(m) + ":";
    else sol += to_string(m) + ":";
    
    if(sc < 10) sol += "0" + to_string(sc);
    else sol += to_string(sc);
    
    
    return sol;
}