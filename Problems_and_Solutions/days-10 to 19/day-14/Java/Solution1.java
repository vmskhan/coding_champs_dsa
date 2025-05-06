class Solution1 {
    public static void print_divisors(int n) {
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 20;
        print_divisors(n);
    }
}
