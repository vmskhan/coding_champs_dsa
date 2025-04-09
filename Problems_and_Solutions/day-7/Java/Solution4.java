import java.util.Arrays;
class Solution4{
    // Approach-1 : Linear Search
    public static int[] getFloorAndCeil1(int x, int[] arr) {
        int floor = -1;
        int ceil = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= x && arr[i] > floor){
                floor = arr[i];
            }
            if(arr[i] >= x && arr[i] < ceil){
                ceil = arr[i];
            }
        }
        
        if(ceil == Integer.MAX_VALUE){
            ceil = -1;
        }
        
        return new int[]{floor,ceil};
    }

    // Approach-2 : Binary Search
    public static int[] getFloorAndCeil2(int x, int[] arr){
        Arrays.sort(arr);
        int floor = -1, ceil = -1;
        int l = 0, r = arr.length-1;
        
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid] == x){
                return new int[]{x, x};
            }else if(arr[mid] < x){
                floor = arr[mid];
                l = mid + 1;
            }else{
                ceil = arr[mid];
                r = mid - 1;
            }
        }
        return new int[]{floor, ceil};
    }

    public static void main(String args[]){
        int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
        int x = 7;

        int[] res = getFloorAndCeil1(x, arr);
        System.out.println(Arrays.toString(res));
    }
}