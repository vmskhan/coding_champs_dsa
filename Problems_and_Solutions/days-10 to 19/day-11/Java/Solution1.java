import java.util.Arrays;
class Solution1 {
    public static void bubbleSort(int[] arr, int n) {
        if (n == 1) return;

        for(int i=0; i<n; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        
        bubbleSort(arr,n-1);
    }

    public static void main(String[] args){
        int a[] = {4, 1, 3, 9, 7};
        bubbleSort(a,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}