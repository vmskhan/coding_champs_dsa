class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int zeroPointer=-1,temp=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]!=0)
            {
                zeroPointer++;
                temp=nums[zeroPointer];
                nums[zeroPointer]=nums[i];
                nums[i]=temp;
            }
        }
    }
};