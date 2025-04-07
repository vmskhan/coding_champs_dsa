class Solution2 {
    // Approach-1 : Linear Search
    public static int findFloor1(int[] arr, int x) {
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= x){
                ans = i;
            }
        }
        return ans;
    }

    // Approach-2 : Binary Search
    public static int findFloor2(int[] arr, int x) {
        int ans = -1;
        int l = 0;
        int r = arr.length-1;
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid] <= x){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        System.out.println(findFloor1(arr,x));
    }
}