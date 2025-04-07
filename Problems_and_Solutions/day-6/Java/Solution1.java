import java.util.Arrays;
class Solution1 {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int arr[] ={4, 1, 3, 9, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}