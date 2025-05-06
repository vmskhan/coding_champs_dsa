class Solution4 {
    public static int maxDepth(String s) {
        int count = 0;
        int ans = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                count++;
            }else if(c == ')'){
                count--;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
}
