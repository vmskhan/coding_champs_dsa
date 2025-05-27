import java.util.*;

class Solution1 {    
    // Approach-1 : Count 0's, 1's and 2's and replace in array
    public static void sortColors1(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        for(int num : nums){
            if(num == 0){
                c0++;
            }else if(num == 1){
                c1++;
            }else{
                c2++;
            }
        }

        int idx = 0;
        for(int i=0; i<c0; i++){
            nums[idx++] = 0;
        }

        for(int i=0; i<c1; i++){
            nums[idx++] = 1;
        }

        for(int i=0; i<c2; i++){
            nums[idx++] = 2;
        }   
    }

    // Approach-2 : Dutch National Flag Algorithm
    public static void sortColors2(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int m = 0;

        while (m <= r) {
            if (nums[m] == 0) {
                // swap nums[l] and nums[m]
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else {
                // swap nums[m] and nums[r]
                int temp = nums[m];
                nums[m] = nums[r];
                nums[r] = temp;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 0, 2, 1, 1, 0};
        sortColors1(nums);
        System.out.println(Arrays.toString(nums));
    }
}