import java.util.HashMap;
import java.util.Arrays;

class Solution2 {
    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> s1 = new HashMap<>();
        HashMap<Character, Character> t1 = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(s1.containsKey(c1)){
                if(s1.get(c1) != c2) return false;
            }else{
                s1.put(c1, c2);
            }

            if(t1.containsKey(c2)){
                if(t1.get(c2) != c1) return false;
            }else{
                t1.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";
        System.out.println(isIsomorphic(s1,t1));
    }
}