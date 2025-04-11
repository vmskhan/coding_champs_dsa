class Solution {
  public:
    // Please change the array in-place
    void insertionSort(vector<int>& arr) {
        // code here
        int i=0,j=0,temp=0;
        
        for(i=1;i<arr.size();i++)
        {
            temp=arr[i];
            for(j=i-1;j>=0;j--)
            {
                if(temp<arr[j])
                    arr[j+1]=arr[j];
                else
                    break;
            }
            arr[j+1]=temp;
        }
    }
};