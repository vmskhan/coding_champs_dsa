class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int length=nums.size();
        if(length==0)
            return vector<int>{-1,-1};
        int low1=0,low2=0;
        int high1=length-1;
        int high2=length-1;
        int mid=0;
        while(low1<=high1)
        {
            mid=(low1+high1)/2;
            if(target<=nums[mid])
                high1=mid-1;
            else
                low1=mid+1;
        }
        while(low2<=high2)
        {
            mid=(low2+high2)/2;
            if(target>=nums[mid])
                low2=mid+1;
            else
                high2=mid-1;
        }
        low1=low1>nums.size()-1 || nums[low1]!=target?-1:low1;
        high2=high2<0 || nums[high2]!=target?-1:high2;
        return vector<int>{low1,high2};
    }
};