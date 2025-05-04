import java.util.Arrays;

class Solution2 {
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = first(nums, target, n);
        int last = last(nums, target, n);
        if (first == n || nums[first] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{first, last - 1};
    }

    public static int first(int[] nums, int target, int n) {
        int low = 0, high = n - 1, ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int last(int[] nums, int target, int n) {
        int low = 0, high = n - 1, ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
