class Solution5{
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            int count = 1;
            for(int j=i; j<=n; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int n = 6;
        pattern(n);
    }
}