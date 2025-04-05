class Solution4{
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            char ch = 'A';
            for(int j=i; j<=n; j++){
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