import java.util.HashMap;

class Solution2 {
    // Approach-1 : Linear Search
    public static int searchInsert1(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= target){
                return i;
            } 
        }
        return nums.length;
    }

    // Approach-2 : Binary Search
    public static int searchInsert2(int[] nums, int target) {
        int ans = nums.length;
        int l = 0;
        int r = nums.length-1;

        while(l <= r){
            int mid=(l+r)/2;
            if(nums[mid] >= target){
                ans = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int nums[] = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert1(nums,target));
    }
}