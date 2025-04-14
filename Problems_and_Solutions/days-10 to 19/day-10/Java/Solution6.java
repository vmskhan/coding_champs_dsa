class Solution6{
    public static void pattern(int n) {
        int size = 2*n-1;
        for(int i=1; i<=size; i++){
            for (int j=1; j<=size; j++){
                int top = i-1;
                int left = j-1;
                int right = size-j;
                int bottom = size-i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n-min) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n = 4;
        pattern(n);
    }
}