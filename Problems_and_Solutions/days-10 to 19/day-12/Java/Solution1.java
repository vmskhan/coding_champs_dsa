import java.util.Arrays;
class Solution1 {
    public static void insertionSort(int[] arr, int n) {
        if (n == 0) return;

        insertionSort(arr,n-1);

        for(int j=n; j>0; j--){
            if(arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args){
        int a[] = {4, 1, 3, 9, 7};
        insertionSort(a,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
