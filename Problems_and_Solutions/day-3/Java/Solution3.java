class Solution3{
    // Approach 1: Two-Pass Solution
    public static int secondLargest1(int[] arr) {
        int max = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int smax = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
        }
        return smax == max? -1 : smax;
    }

    // Approach 2: Single-Pass Solution
    public static int secondLargest2(int[] arr) {
        int max = -1;
        int smax = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            } 
            else if(arr[i] > smax && arr[i] < max){
                smax = arr[i];
            }
        }
        return smax;
    }

    public static void main(String args[]){
        int[] arr = {10, 5, 20, 8, 25, 3};
        System.out.println(secondLargest1(arr));
    }
}