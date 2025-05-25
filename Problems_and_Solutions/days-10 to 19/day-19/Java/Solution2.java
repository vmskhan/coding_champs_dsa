class Solution2 {
    // Approach-1 : Using string functions
    public static String reverseWords1(String s) {
        String[] temp = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for (int i = temp.length - 1; i >= 0; i--) {
            sb.append(temp[i]).append(" ");
        }
        
        return sb.toString().trim();
    }

    // Approach-2 : Using two pointers
    public static String reverseWords2(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while(i >= 0){
            while(i >= 0 && s.charAt(i) == ' ') i--; // skips empty spaces
            int j = i;

            while(i >= 0 && s.charAt(i) != ' ') i--;
            sb.append(s.substring(i+1, j+1));
            if (i != 0) sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String args[]){
        String s = "the sky is blue";
        System.out.println(reverseWords1(s));
    }
}
