class Solution {
  public:
    // Function to perform selection sort on the given array.
    void selectionSort(vector<int> &arr) {
        // code here
        int i=0,j=0,minIndex=0,temp=0;
        for(i=0;i<arr.size()-1;i++){
            minIndex=i;
            for(j=i+1;j<arr.size();j++)
            {
               if(arr[j]<arr[minIndex])
                minIndex=j;
            }
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
            
        }
    }
};