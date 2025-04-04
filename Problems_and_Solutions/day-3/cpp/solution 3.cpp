class Solution {
  public:
    // Function returns the second
    // largest elements
    int getSecondLargest(vector<int> &arr) {
        int max=arr[0];
        int smax=-1;
        for(int i=1;i<arr.size();i++)
        {
            if(arr[i]>max)
            {
                smax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>smax)
            {
                smax=arr[i];
            }
        }
        
        return smax;
    }
};
