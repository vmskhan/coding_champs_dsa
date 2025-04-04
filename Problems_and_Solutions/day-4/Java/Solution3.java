class Solution3{ 
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0,ones=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                ones++;
            }
            else{
                ones=0;
            }
            count = Math.max(ones,count);
        }
        return count;
    }

    public static void main(String args[]){
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}