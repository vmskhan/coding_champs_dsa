class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0) return false;
        return x==reverseNumber(x);
    }

    long reverseNumber(int x){
        long revNum=0;
        while(x!=0){
            revNum=revNum*10+(x%10);
            x/=10;
        }
        return revNum;
    }
};