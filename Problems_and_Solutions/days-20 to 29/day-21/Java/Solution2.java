import java.util.*;

class Solution2 {
    // Approach-1 Using Two Lists
    public static int[] rearrangeArray1(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        for (int i = 0; i < nums.length / 2; i++) {
            nums[2 * i] = pos.get(i);
            nums[2 * i + 1] = neg.get(i);
        }

        return nums;
    }

    // Approach-2 : Using temp array
    public static int[] rearrangeArray2(int[] nums) {
        int temp[] = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                temp[pos] = nums[i];
                pos += 2;
            }
            else{
                temp[neg] = nums[i];
                neg += 2;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray1(arr)));
    }
}