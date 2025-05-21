class Solution1 {
    // Approach-1 : Bruteforce by generating sub arrays
    public static int maxSubArray1(int[] nums) {
        int maxSum = nums[0];

        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
    
    // Approach-2 : Kadane's Algorithm
    public static int maxSubArray2(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        
        for(int i : nums){
            sum += i;
            maxSum = Math.max(maxSum, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray1(nums));
    }
}