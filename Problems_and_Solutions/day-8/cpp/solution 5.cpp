class Solution {
  public:
    int countFreq(vector<int>& arr, int target) {
        // code here
        int count=0;
        int low=0,high=arr.size()-1,mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(target<=arr[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        
        while(arr[low]==target && low<arr.size())
        {
            count++;
            low++;
        }
        return count;
        
    }
};
