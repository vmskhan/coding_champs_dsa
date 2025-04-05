import java.util.Arrays;
import java.util.LinkedHashSet;

class Solution3{ 
    // Approach-1: Using Set
    public static int removeDuplicates1(int[] nums){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int j = 0;
        for(int i : set){
            nums[j++] = i;
        }
        return j;
    }

    // Approach-2: Two pointers 
    public static int removeDuplicates2(int[] nums){
        int j=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String args[]){
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates1(nums));
    }
}