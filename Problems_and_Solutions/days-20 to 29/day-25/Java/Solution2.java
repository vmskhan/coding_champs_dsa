import java.util.*;

class Solution2 {
    // Approach-1 : Bruteforce by generating sub arrays
    public static int subarraySum1(int[] nums, int k) {
        int count = 0;

        for(int i=0; i<nums.length; i++){
            int sum = 0;

            for(int j=i; j<nums.length; j++){
                sum += nums[j];

                if(sum == k){
                    count++;
                }
            }
        }

        return count;
    }

    // Approach-2 : HashMap
    public static int subarraySum2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int count = 0;

        for(int num : nums){
            sum += num;
            count += map.getOrDefault(sum-k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println(subarraySum1(nums, k));
    }
}
