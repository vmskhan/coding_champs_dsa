void alphaRamp(int n) {
    // Write your code here.
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
            cout<<char(64+i)<<" ";
        cout<<endl;
    }
}
