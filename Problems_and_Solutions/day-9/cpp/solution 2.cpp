class Solution {
public:
    int missingNumber(vector<int>& nums) {
        long sum=0;
        int n=nums.size();
        for(int i:nums)
            sum+=i;
        return ((n*(n+1))/2)-sum;
    }
};