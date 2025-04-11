class Solution {
  public:

    int findFloor(vector<int>& arr, int x) {
        // Binary Search method
        int low=0;
        int high=arr.size()-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]<=x)
                low=mid+1;
            else
                high=mid-1;
        }
        
        if(high>=0 && arr[high]<=x)
            return high;
        else
            return -1;
    }
};