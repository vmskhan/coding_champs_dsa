class Solution {
  public:

    int findFloor(vector<int>& arr, int x) {
        //linear search method
        int i=0;
        for(i=0;i<arr.size();i++)
        {
            if(arr[i]>x)
                break;
        }
        return i-1;
        
    }
};
