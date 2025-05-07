class Solution {
  public:
    // Please change the array in-place
    void insertionSort(vector<int>& arr) {
        // code here
       rec1(arr,1);
    }
    void rec1(vector<int>& arr,int i){
        if(i<arr.size())
        {
            rec2(arr,i);
            rec1(arr,i+1);
        }
        
    }
    void rec2(vector<int>& arr,int j){
        if(j>0)
        {
            if(arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                rec2(arr,j-1);
            }
            else
                return;
            
        }
    }
};