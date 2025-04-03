import java.util.ArrayList;
class Solution3{
    public static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            long ans = fact(i);
            if(ans <= n){
                list.add(ans);
            }else{
                break;
            }
        }
        return list;
    }
    
    public static long fact(int n){
        if(n == 0 || n == 1) return 1;
        return n*fact(n-1);
    }
    
    public static void main(String args[]){
        long n = 6;
        System.out.println(factorialNumbers(n));
    }
}