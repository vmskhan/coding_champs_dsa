void alphaTriangle(int n) {
    // Write your code here.
    for(int i=1;i<=n;i++)
    {
        int a=n;
        for(int j=1;j<=i;j++,a--)
            cout<<char(64+a)<<" ";
        cout<<endl;
    }

}