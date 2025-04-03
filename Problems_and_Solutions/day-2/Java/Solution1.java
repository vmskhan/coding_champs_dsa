import java.util.*;
class Solution1 {
    // Approach-1: Sorting the array and return the last element
    public static int largest1(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    // Approach-2: Iterating through the array to find the maximum element
    public static int largest2(int[] arr){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {10, 5, 20, 8, 25, 3};
        System.out.println(largest1(arr));
    }
}