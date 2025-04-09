import java.util.Arrays;
class Solution2 {
    // Approach-1 : Create temp array and move non zero numbers
    public static void moveZeroes1(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];
        int idx = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                temp[idx++] = nums[i];
            }
        }

        for(int i=0; i<temp.length; i++){
            nums[i] = temp[i];
        }
    }

    // Approach-2 : Two pointers 
    public static void moveZeroes2(int[] nums) {
        int l = 0;
        int r = 0;
        while(r < nums.length){
            if(nums[r] != 0){
                int temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
                l++;
                r++;
            }else{
                r++;
            }
        }
    }

    public static void main(String[] args){
        int nums[] = {0, 1, 0, 3, 12};
        moveZeroes1(nums);
        System.out.println(Arrays.toString(nums));
    }
}