class Solution {
  public:
    vector<int> lcmAndGcd(int a, int b) {
        // code here
        int gcd=getGcd(a,b);
        return vector<int>{(a*b)/gcd,gcd};
    }
    
    int getGcd(int a,int b)
    {
        if(a%b==0)
            return b;
        else
            return getGcd(b,a%b);
    }
    int getIGcd(int a,int b)
    {
        int temp=b;
        while(b!=0)
        {
            temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
};