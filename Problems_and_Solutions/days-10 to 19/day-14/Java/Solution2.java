import java.util.HashMap;
import java.util.Arrays;

class Solution2 {
    // Approach 1: Sorting
    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];  
    }

    // Approach 2: HashMap
    public static int majorityElement2(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if (count > nums.length / 2) {
                return num;
            }
        }
        return -1; 
    }

    // Approach 3: Moore Voting Algorithm
    public static int majorityElement3(int[] nums) {
        int count = 0, candidate = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(candidate == num){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement1(nums));
    }
}
