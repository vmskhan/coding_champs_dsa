class Solution6{
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            char ch = (char)('A'+ n-i);
            for(int j=1; j<=i; j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n = 6;
        pattern(n);
    }
}