class Solution {
  public:
    int largest(vector<int> &arr) {
        int max=arr[0];
        for(int i=1;i<arr.size();i++)
            if(max<arr[i])
                max=arr[i];
        return max;
    }
};