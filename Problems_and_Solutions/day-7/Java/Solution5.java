import java.util.Arrays;
class Solution5{
    // Approach-1: Check all possible rotations of 'goal'
    public static boolean rotateString1(String s, String goal) {
        char s1[] = s.toCharArray();
        char s2[] = goal.toCharArray();
        for(int i=0; i<s1.length; i++){
            if(Arrays.equals(s1, s2)){
                return true;
            }
            rotateOnce(s2);
        }
        return false;
    }

    public static void rotateOnce(char[] arr){
        char temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    // Approach-2: Concatenate s with itself and check if it contains goal
    public static boolean rotateString2(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String temp = s + s;
        return temp.contains(goal);
    }
    
    public static void main(String args[]){
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString1(s,goal));
    }
}