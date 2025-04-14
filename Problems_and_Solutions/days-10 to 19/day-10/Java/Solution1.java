import java.util.Arrays;
class Solution1 {
    public static void quickSort(int a[], int l, int r){
        if(l < r){
            int pi = partition(a,l,r);
            quickSort(a,l,pi-1);
            quickSort(a,pi+1,r);
        }
    }
    
    public static int partition(int a[], int l, int r){
        int pivot = a[r];
        int i=l-1;
        for(int j=l; j<r; j++){
            if(a[j] < pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;
        return i+1;
    }

    public static void main(String[] args){
        int a[] = {4, 1, 3, 9, 7};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}