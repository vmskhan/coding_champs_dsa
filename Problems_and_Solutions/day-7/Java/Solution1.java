import java.util.Arrays;
class Solution1 {
    public static void selectionSort(int a[]){
        int n = a.length;
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args){
        int a[] ={4, 1, 3, 9, 7};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}