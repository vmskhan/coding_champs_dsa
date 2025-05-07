class Solution {
  public:
    void print_divisors(int n) {
        // Code here.
        if(n!=1)
            cout<<1<<" ";
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                cout<<i<<" ";
        cout<<n<<" ";
    }
};