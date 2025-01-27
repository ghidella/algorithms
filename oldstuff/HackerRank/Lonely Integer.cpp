//https://www.hackerrank.com/challenges/lonely-integer/problem

int lonelyinteger(vector<int> a) {
    int counter[99] = {}, i;
    
    for(i = 0; i < (int)a.size(); ++i)
        counter[a[i]]++;
    
    
    for(i = 0; i < 99; ++i)
        if(counter[i] == 1)
            break;
     
    return i;
}