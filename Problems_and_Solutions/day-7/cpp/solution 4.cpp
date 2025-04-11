class Solution {
  public:
    vector<int> getFloorAndCeil(int x, vector<int> &arr) {
        // code here
        int floor=-1,ceil=-1;
        for(int i=0;i<arr.size();i++){
            if(arr[i]==x)
            {
                floor=ceil=x;
                break;
            }
            else if(arr[i]<x){
                if(floor==-1 || arr[i]>floor)
                    floor=arr[i];
            }
            else if(ceil==-1 || arr[i]<ceil)
                    ceil=arr[i];
        }
        return vector<int>{floor,ceil};
    }
};