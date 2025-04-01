class Solution3{
    public static int evenlyDivides(int n) {
        int temp = n;
        int count = 0;
        while(temp != 0){
            int r = temp%10;
            if(r > 0 && n%r == 0){
                count++;
            }
            temp /= 10;
        }
        return count;
    }
    
    public static void main(String args[]){
        int n = 1012;
        System.out.println(evenlyDivides(n));
    }
}