class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int max=0;
        int curCount=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i])
                curCount++;
            else
            {
                if(curCount>max)
                    max=curCount;
                curCount=0;
            }
            
        }  
        if(curCount>max)
            max=curCount;
        return max; 
    }
};