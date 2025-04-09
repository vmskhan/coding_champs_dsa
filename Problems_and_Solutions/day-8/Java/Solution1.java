import java.util.Arrays;
class Solution1 {
    public static void insertionSort(int arr[]) {
        for(int i=0; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int a[] ={4, 1, 3, 9, 7};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}