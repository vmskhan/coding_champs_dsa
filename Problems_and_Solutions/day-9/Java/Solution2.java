import java.util.Arrays;
class Solution2 {
    // Approach-1 : Using sorting
    public static int missingNumber1(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i)
                return i;
        }
        return nums.length;
    }

    // Approach-2 : Using sum of array and sum of numbers
    public static int missingNumber2(int[] nums) {
        int n=nums.length;
        int sum1=0,sum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum1+=nums[i];
        }
        return sum-sum1;
    }

    // Approach-3 : Using Bit manipulation(xor)
    public static int missingNumber3(int[] nums) {
        int n = nums.length;
        int ans = n;
        for(int i=0; i<n; i++){
            ans ^= i ^ nums[i];
        }
        return ans;
    }

    public static void main(String[] args){
        int nums[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber1(nums));
    }
}