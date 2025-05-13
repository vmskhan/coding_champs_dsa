import java.util.Arrays;

class Solution1 {
    // Approach-1 : Using temp array
    public static void rotate1(int[] nums, int k) {
        int[] temp = new int[k];
        int n = nums.length;
        k = k%n;

        for(int i=n-k; i<n; i++){
            temp[i-n+k] = nums[i];
        }

        for(int i=n-k-1; i>=0; i--){
            nums[i+k] = nums[i];
        }

        for(int i=0; i<k; i++){
            nums[i] = temp[i];
        }
    }

    // Approach-2 : Using reverse function
    public static void rotate2(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        if(k > n){
            k = k%n;
        }
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }

    public static void reverse(int a[],int l,int r){
        while(l < r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate1(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
