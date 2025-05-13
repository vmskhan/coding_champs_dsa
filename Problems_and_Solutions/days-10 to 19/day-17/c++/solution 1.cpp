class Solution {
public:
    void sortColors(vector<int>& nums) {
        //Three pointer quicksort method
        int a=-1;
        int b=-1;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==0)
            {
                a++;
                b++;
                if(b!=a)
                {
                    nums[b]=nums[b]^3;
                    nums[i]=nums[i]^2;
                    nums[a]=nums[a]^1;
                }
                else if(a!=i)
                {
                    nums[a]=nums[a]^2;
                    nums[i]=nums[i]^2;
                }                
            }
            else if(nums[i]==1)
            {
                b++;
                nums[b]=nums[b]^3;
                nums[i]=nums[i]^3;
            }
        }
    }
};