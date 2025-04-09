import java.util.Arrays;
class Solution5{
    public static int countFreq1(int[] arr, int target) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }

    public static int countFreq2(int[] arr, int target) {
        int first = firstOccurrence(arr,target);
        int last = lastOccurrence(arr,target);
        return last-first+1;
    }

    public static int firstOccurrence(int nums[], int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r) {
            int mid = (l+r)/2;
            if(nums[mid] >= target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
    
    public static int lastOccurrence(int nums[], int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r) {
            int mid = (l+r)/2;
            if(nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
    
    public static void main(String args[]){
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;
        System.out.print(countFreq1(arr,target));
    }
}