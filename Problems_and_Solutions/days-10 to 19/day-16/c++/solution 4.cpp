class Solution {
public:
    double myPow(double x, int n) {
        return fastPower(x,n);
    }
    double fastPower(double x,long long n)
    {
        double powx=1;
        double base=1;
        bool isNegative=false;
        if(n<0)
        {
            isNegative=true;
            n*=-1;
        }
        while(n!=0)
        {
            if(n%2==1)
                powx=powx*pow(x,base);
            base=base*2;
            n=n/2;
        }
        if(isNegative)
            powx=1/powx;
        return powx;
    }
};