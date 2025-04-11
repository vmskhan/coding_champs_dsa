import java.util.Arrays;
import java.util.HashMap;
class Solution5 {
    // Approach-1 : Using sorting
    public static boolean isAnagram1(String s, String t) {
        if(s.length() != t.length()) return false;
        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
    }

    // Approach-2 : Using HashMap
    public static boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            map.put(a, map.getOrDefault(a, 0) + 1);
            map.put(b, map.getOrDefault(b, 0) - 1);
        }
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram1(s,t));
    }
}