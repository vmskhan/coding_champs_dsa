class Solution {
public:
    long long modNum=pow(10,9) + 7;
    int countGoodNumbers(long long n) {
        long long oddLen=n/2;
        long long evenLen=n-oddLen;
        return (fastPower(5,evenLen)*fastPower(4,oddLen))%modNum;
    }
    long long fastPower(int x,long long n)
    {
        long long rem=1;
        long long powx=x;
        while(n!=0)
        {
            if(n%2==1)
                rem=(rem*powx)%modNum;
            powx=(powx*powx)%modNum;
            n=n/2;
        }
        return rem;
    }
};