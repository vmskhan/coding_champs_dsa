class Solution {
  public:
    // Function to find element in sorted array
    // arr: input array
    // k: element to be searched
    bool searchInSorted(vector<int>& arr, int k) {
        int low=0;
        int high=arr.size()-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==k)
                return true;
            else if(k<arr[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }
};