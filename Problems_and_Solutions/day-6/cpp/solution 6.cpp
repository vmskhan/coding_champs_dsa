void alphaHill(int n) {
    // Write your code here.
    int j=0;
    for(int i=1;i<=n;i++)
    {
        for(j=i;j<=n-1;j++)
            cout<<"  ";
        for(j=1;j<=i;j++)
            cout<<(char)('A'+j-1)<<" ";
        for(j=1;j<i;j++)
            cout<<(char)('A'+i-j-1)<<" ";
        cout<<endl;
    }
}