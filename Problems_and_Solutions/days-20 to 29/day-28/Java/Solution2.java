import java.util.*;
class Solution2 {
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);    
        map.put('V', 5);
        map.put('X', 10);   
        map.put('L', 50);
        map.put('C', 100);  
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            if (curr < prev) {
                sum -= curr;
            } else {
                sum += curr;
            }
            prev = curr;
        }

        return sum;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV";  // Example: 1994
        int ans = romanToInt(roman);
        System.out.println(ans);
    }
}