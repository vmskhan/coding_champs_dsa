class Solution {
  public:
    vector<long long> factorialNumbers(long long n) {
        long long fact=1;
        int num=2;
        vector<long long> arr=vector<long long>();
        while(fact<=n){
            arr.push_back(fact);
            fact=fact*num;
            num++;
        }
        return arr;
    }
};