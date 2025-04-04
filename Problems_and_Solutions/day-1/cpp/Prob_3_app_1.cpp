class Solution {
  public:
    // Function to count the number of digits in n that evenly divide n
    int evenlyDivides(int n) {
        // code here
        int i=0,j;
        int a=n;
        while(n>0)
        {
           j=n%10;
           n=n/10;
           if(j==0)
           continue;
           else if(a%j==0)
           i++;
           
        }
        return i;
    }
};
