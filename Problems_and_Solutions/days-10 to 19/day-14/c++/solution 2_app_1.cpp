class Solution {
public:
    int majorityElement(vector<int>& nums) {
     int i=0,j=0,count=0;
     int n=nums.size();
     int lim=(n/2)+1;
     int temp=nums[0];
     for(i=1;i<n;i++)
     {
        temp=nums[i];
        count=1;
        for(j=i;j>0;j--)
        {
           if(temp==nums[j-1])
           {
                count++;
                // cout<<count<<":";
                if(count>=lim)
                    break;
           }
           if(temp<=nums[j-1])
                nums[j]=nums[j-1];
            else
                break; 
        }
        if(count>=lim)
            break;
        nums[j]=temp;

     }   
    //  cout<<endl<<count<<"-"<<i;
     return temp;
    }
};