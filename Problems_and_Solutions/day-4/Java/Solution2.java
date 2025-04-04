class Solution2 {
    // Approach-1 : Linear Search
    public static boolean searchInSorted1(int arr[], int k) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k){
                return true;
            }
        }
        return false;
    }

    // Approach-2 : Binary Search
    public static boolean searchInSorted2(int arr[], int k) {
        int l = 0;
        int r = arr.length-1;
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid] == k){
                return true;
            }else if(arr[mid] > k){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 6};
        int k = 6;
        System.out.println(searchInSorted2(arr,k));
    }
}