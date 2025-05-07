class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n=nums.size();
        int i=0,j=0,temp=0;
        for(i=0;i<n-1;i++)
        {
            temp=target-nums[i];
            for(j=i+1;j<n;j++)
            {
                if(temp==nums[j])
                    return vector<int>{i,j};
            }
        }
        return vector<int>{0,0};
    }
   
};