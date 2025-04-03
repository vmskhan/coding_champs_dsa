import java.util.Arrays;

class Solution2{
    // Approach 1: Reverse the number and compare it with original number
    public static boolean isPalindrome1(int x){
        if(x < 0) return false;
        int temp = x;
        int rev = 0;
        while(temp != 0){
            int r = temp%10;
            rev = (rev*10) + r;
            temp /= 10;
        }
        return rev == x;
    }

    // Approach 2: Convert to string and use two pointers left and right
    public static boolean isPalindrome2(int x){
        String s = String.valueOf(x);
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String args[]){
        int x = 121;
        System.out.println(isPalindrome1(x));
    }
}