class Solution4 {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && count++ > 0) {
                sb.append(c);
            }
            if (c == ')' && count-- > 1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "(()())(())";
        String result = removeOuterParentheses(input);
        System.out.println(result);
    }
}
