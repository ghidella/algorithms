//https://www.hackerrank.com/challenges/sparse-arrays/problem

vector<int> matchingStrings(vector<string> strings, vector<string> queries) {
    vector<int> result;
    for (const string& query : queries) {
        int count = 0;
        for (const string& str : strings) {
            if (query == str) {
                count++;
            }
        }
        result.push_back(count);
    }
    return result;
}