class Solution5{
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            for(int j=i; j<n; j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int n = 6;
        pattern(n);
    }
}