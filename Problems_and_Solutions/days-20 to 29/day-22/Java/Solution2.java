import java.util.*;

class Solution2 {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) ->
            Integer.compare(map.get(b), map.get(a))
        );

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            int freq = map.get(c);
            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "cccaaa";
        System.out.println(frequencySort(input));
    }
}