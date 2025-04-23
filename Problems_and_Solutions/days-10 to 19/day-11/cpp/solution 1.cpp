class Solution {
  public:
    // Function to sort the array using bubble sort algorithm.
    void bubbleSort(vector<int>& arr) {
        rec1(arr,0);
        
    }
    void rec1(vector<int>& arr,int i){
        if(i<arr.size())
        {
            rec2(arr,i,0);
            rec1(arr,i+1);
        }
        
    }
    void rec2(vector<int>& arr,int i,int j){
        if(j<arr.size()-1-i)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            rec2(arr,i,j+1);
        }
    }
};