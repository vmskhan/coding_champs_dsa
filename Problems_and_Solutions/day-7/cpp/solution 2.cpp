class Solution {
public:
    bool check(vector<int>& nums) {
        int increasingOrderFailed=0;
        int noOfComparisons=0;
        int n=nums.size();
        for(int i=0;noOfComparisons<n;i++)
        {
            if(nums[i]>nums[(i+1)%n])
            {
                increasingOrderFailed++;
                if(increasingOrderFailed>1)
                    return false;
            }
            noOfComparisons++;
        }
        return true;
    }
};