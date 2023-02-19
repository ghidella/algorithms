//https://www.hackerrank.com/challenges/mini-max-sum/problem

void miniMaxSum(vector<int> arr) {
    sort(arr.begin(), arr.end());

    long long int sum = 0;

    for(int i = 0; i < 5; i++) sum += arr[i];
    cout<<sum-arr[arr.size()-1]<<" "<<sum-arr[0]<<endl;
}