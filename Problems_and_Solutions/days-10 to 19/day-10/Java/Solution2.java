import java.util.HashMap;

class Solution2 {
    // Approach-1 : HashMap
    public static int singleNumber1(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i : map.keySet()){
            int value = map.get(i);
            if(value == 1){
                return i;
            }
        }
        return -1;
    }

    // Approach-2 : Using xor
    public static int singleNumber2(int[] nums) {
        int ans = 0;
        for(int i : nums){
            ans ^= i;
        }
        return ans;
    }

    public static void main(String[] args){
        int nums[] = {4, 1, 2, 1, 2};
        System.out.println(singleNumber2(nums));
    }
}