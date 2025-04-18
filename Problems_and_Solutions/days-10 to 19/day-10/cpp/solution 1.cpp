#include <bits/stdc++.h> 

int partition(vector<int>& arr,int low,int high)
{
    int pivot=arr[low];
    int j=low;
    int temp=0;
    for(int i=low+1;i<high;i++)
    {
        if(arr[i]<pivot)
        {
            j++;
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }

    }
    arr[low]=arr[j];
    arr[j]=pivot;
    return j;
}

void recursiveSort(vector<int>& arr,int low,int high){
    if(low<high)
    {
    int partitionIndex=partition(arr,low,high);
    recursiveSort(arr,low,partitionIndex);
    recursiveSort(arr,partitionIndex+1,high);
    }
}


vector<int> quickSort(vector<int> arr)
{
    // Write your code here.
    recursiveSort(arr,0,arr.size());
    return arr;
    
    
}

