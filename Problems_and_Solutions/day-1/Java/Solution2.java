import java.util.Arrays;

class Solution2{
    public static int[] lcmAndGcd(int a, int b) {
        // LCM * GCD = a*b
        int gcd = gcdRecursive(a,b);
        int lcm = (a*b)/gcd;
        int res[] = {lcm,gcd};

        return res;
    }

    // Iterative Approach
    public static int gcdIterative(int a, int b){
        int gcd = 1;
        for(int i=1; i<=Math.min(a,b); i++){
            if(a%i == 0 && b%i == 0){
                gcd=i;
            }
        }
        return gcd;
    }

    // Recursive Approach
    public static int gcdRecursive(int a, int b){
        if(a==0) return b;
        return gcdRecursive(b%a,a);
    }

    public static void main(String args[]){
        int a = 5;
        int b = 10;

        int[] result = lcmAndGcd(a,b);
        System.out.println(Arrays.toString(result));
    }
}